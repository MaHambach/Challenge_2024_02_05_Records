package org.github.mahambach.Records;

public record Animal(
        int id,
        String name,
        Species species,
        int age,
        Owner owner) {
}
