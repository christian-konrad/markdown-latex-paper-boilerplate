// ...
TransactionalGraph graph = Neo4jGraph.open("/integrationGraph")

// order matters
List<String> ruleFiles = [
    './ruleA.groovy', 
    './ruleB.groovy',
    // ...
]

List<TransformationRule> rules = ruleFiles.collect {
    file -> new TransformationRule ( generatedRuleFile: file )
}

rules.each { rule -> rule.apply(graph) }
// ...
