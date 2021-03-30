package org.noteconcepts.controller;

import org.noteconcepts.model.Concept;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/concepts")
public class ConceptController {

    Concept _conceptsMock[] = {
            new Concept("La vie", "Oui"),
            new Concept("Le Football", "Le sport de Zidane"),
            new Concept("L'entropie", "Quand t'as pas rangé ta chambre"),
            new Concept("La dépression", "C'est quand on est triste"),
            new Concept("Le capitalisme", "Acheter des trucs"),
            new Concept("Le communisme", "Quand on partage"),
            new Concept("L'anarchisme'", "Quand on refuse toute forme de subordination"),

    };

    @GetMapping
    public @ResponseBody Concept[] getConcepts() {
        return _conceptsMock;
    }
}
