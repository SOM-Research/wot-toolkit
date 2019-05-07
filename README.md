# Web of Things Toolkit

Prototypical implementation of the W3C Web of Things proposal using the EMF stack

## Thing Description metamodel

### Core model

![Core model](edu.uoc.som.wot.td/model/td-core.png)

### Data Schema model

![Data Schema model](edu.uoc.som.wot.td/model/td-data-schema.png)

### Security model

![Security model](edu.uoc.som.wot.td/model/td-security.png)

## Example instance

Example Thing Description from [https://www.w3.org/TR/wot-thing-description/#simple-thing-description-sample](https://www.w3.org/TR/wot-thing-description/#simple-thing-description-sample):

```
{
    "id": "urn:dev:wot:com:example:servient:lamp",
    "name": "MyLampThing",
    "security": [{"scheme": "basic"}],
    "properties": {
        "status" : {
            "type": "string",
            "forms": [{"href": "https://mylamp.example.com/status"}]
        }
    },
    "actions": {
        "toggle" : {
            "forms": [{"href": "https://mylamp.example.com/toggle"}]
        }
    },
    "events":{
        "overheating":{
            "type": "string",
            "forms": [{
                "href": "https://mylamp.example.com/oh",
                "subProtocol": "LongPoll"
            }]
        }
    }
}
```

Example Thing Description represented as an instance of the _Thing Description metamodel_:

```
<?xml version="1.0" encoding="UTF-8"?>
<td:Thing xmi:version="2.0"
    xmlns:xmi="http://www.omg.org/XMI"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xmlns:td="http://edu.uoc.som/wot/td/1.0"
    xsi:schemaLocation="http://edu.uoc.som/wot/td/1.0 td.ecore"
    name="MyLampThing"
    id="urn:dev:wot:com:example:servient:lamp">
  <security
      xsi:type="td:BasicSecurityScheme"
      scheme="basic"/>
  <properties
      label="status"
      type="string">
    <forms href="https://mylamp.example.com/status"/>
  </properties>
  <events label="overheating"
      type="string">
    <forms href="https://mylamp.example.com/oh"
        subProtocol="LongPoll"/>
  </events>
  <actions label="toggle">
    <forms href="https://mylamp.example.com/toggle"/>
  </actions>
</td:Thing>
```
