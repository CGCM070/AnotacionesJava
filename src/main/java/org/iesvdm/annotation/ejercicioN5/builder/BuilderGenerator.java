package org.iesvdm.annotation.ejercicioN5.builder;

import com.squareup.javapoet.*;
import org.iesvdm.annotation.ejercicioN5.util.ReflectionUtils;

import javax.annotation.processing.ProcessingEnvironment;
import javax.lang.model.element.Element;
import javax.lang.model.element.Modifier;
import javax.lang.model.element.TypeElement;
import javax.lang.model.type.TypeMirror;
import java.io.IOException;
import java.util.List;

public class BuilderGenerator {

    private ProcessingEnvironment processingEnv;

    public BuilderGenerator(ProcessingEnvironment processingEnv) {
        this.processingEnv = processingEnv;
    }

    public void generate(TypeElement classElement) {
        String builderName = classElement.getSimpleName().toString() + "Builder";

        TypeSpec.Builder builderClass = TypeSpec.classBuilder(builderName)
                .addModifiers(Modifier.PUBLIC, Modifier.STATIC);

        addFieldsAndMethods(builderClass, classElement);
        addBuildMethod(builderClass, classElement);

        try {
            JavaFile.builder(processingEnv.getElementUtils().getPackageOf(classElement).toString(), builderClass.build())
                    .build()
                    .writeTo(processingEnv.getFiler());
        } catch (IOException e) {
            processingEnv.getMessager().printMessage(javax.tools.Diagnostic.Kind.ERROR,
                    "Error generando el builder: " + e.getMessage());
        }
    }

    public void addFieldsAndMethods(TypeSpec.Builder builderClass, TypeElement classElement) {
        addFieldsFromClass(builderClass, classElement);

        TypeMirror superClass = classElement.getSuperclass();
        while (superClass != null && !superClass.toString().equals(Object.class.getCanonicalName())) {
            TypeElement superClassElement = (TypeElement) processingEnv.getTypeUtils().asElement(superClass);
            addFieldsFromClass(builderClass, superClassElement);
            superClass = superClassElement.getSuperclass();
        }
    }

    public void addFieldsFromClass(TypeSpec.Builder builderClass, TypeElement classElement) {
        List<? extends Element> enclosedElements = classElement.getEnclosedElements();
        for (Element enclosedElement : enclosedElements) {
            // Verificar que el elemento es un campo, no es privado y no es estático
            if (enclosedElement.getKind().isField()
                    && ReflectionUtils.isNonPrivate(enclosedElement)
                    && ReflectionUtils.isNonStatic(enclosedElement)) {
                FieldSpec fieldSpec = FieldSpec.builder(TypeName.get(enclosedElement.asType()), enclosedElement.getSimpleName().toString())
                        .addModifiers(Modifier.PRIVATE)
                        .build();

                builderClass.addField(fieldSpec);

                MethodSpec method = MethodSpec.methodBuilder(enclosedElement.getSimpleName().toString())
                        .addModifiers(Modifier.PUBLIC)
                        .returns(ClassName.get("", builderClass.build().name))
                        .addParameter(TypeName.get(enclosedElement.asType()), enclosedElement.getSimpleName().toString())
                        .addStatement("this.$L = $L", enclosedElement.getSimpleName(), enclosedElement.getSimpleName())
                        .addStatement("return this")
                        .build();

                builderClass.addMethod(method);
            }
        }
    }


    public void addBuildMethod(TypeSpec.Builder builderClass, TypeElement classElement) {
        MethodSpec buildMethod = MethodSpec.methodBuilder("build")
                .addModifiers(Modifier.PUBLIC)
                .returns(ClassName.get(classElement))
                .addStatement("return new $T(this)", classElement)
                .build();

        builderClass.addMethod(buildMethod);
    }
}
