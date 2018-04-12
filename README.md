# casing-json
Experiment with https://github.com/battermann/sbt-json to generate Scala case classes from JSON.

* Put {name}.json under src/main/resources/json
* sbt compile
* check target/scala-{version}/src_managed/compiled_json/jsonmodels/{name}/{cap-name} for case classes
