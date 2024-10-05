package org.iesvdm.annotation.ejercicioN5.processor;

import org.iesvdm.annotation.ejercicioN5.annotations.SuperBuilder;
import org.iesvdm.annotation.ejercicioN5.builder.BuilderGenerator;

import javax.annotation.processing.*;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Element;
import javax.lang.model.element.ElementKind;
import javax.lang.model.element.TypeElement;
import javax.tools.Diagnostic;
import java.util.Set;

@SupportedAnnotationTypes("org.iesvdm.annotation.ejercicioN5.annotation.SuperBuilder")
@SupportedSourceVersion(SourceVersion.RELEASE_8)
public class SuperBuilderProcessor extends AbstractProcessor {

    private BuilderGenerator builderGenerator;


    public synchronized void init(ProcessingEnvironment processingEnvironment) {
        super.init(processingEnvironment);
        builderGenerator = new BuilderGenerator(processingEnvironment);
    }

    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
        for (Element element : roundEnv.getElementsAnnotatedWith(SuperBuilder.class)) {
            // Verifica que el elemento sea una clase (TypeElement)
            if (element.getKind() == ElementKind.CLASS) {
                TypeElement classElement = (TypeElement) element;  // Convierte a TypeElement solo si es clase
                builderGenerator.generate(classElement);  // Generar el builder
            } else {
                processingEnv.getMessager().printMessage(Diagnostic.Kind.ERROR,
                        "La anotación @SuperBuilder solo puede aplicarse a clases.");
            }
        }
        return true;
    }
}
