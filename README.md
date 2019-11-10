# Web of Things Toolkit

Prototypical implementation of the W3C Web of Things proposal using the EMF stack.

## Thing Description metamodel

### Core vocabulary model

![TD core vocabulary model](plugins/edu.uoc.som.wot.td/model/td-core.png)

### Data Schema vocabulary model

![ JSON schema vocabulary model](plugins/edu.uoc.som.wot.td/model/json-schema.png)

### WoT security vocabulary model

![WoT security vocabulary model](plugins/edu.uoc.som.wot.td/model/wot-security.png)

### Hypermedia controls vocabulary model

![Hypermedia controls vocabulary model](plugins/edu.uoc.som.wot.td/model/hypermedia-controls.png)

## Installation

To install the toolkit use the following update site:

> https://som-research.github.io/wot-toolkit/updates

### Prerequisites

* The toolkit requires [Eclipse 4.12 (2019-06)](https://download.eclipse.org/eclipse/downloads/drops4/R-4.12-201906051800/) or [above](https://download.eclipse.org/eclipse/downloads/).

## Example instance

Example Thing Description from [https://www.w3.org/TR/2019/CR-wot-thing-description-20190516/#simple-thing-description-sample](https://www.w3.org/TR/2019/CR-wot-thing-description-20190516/#simple-thing-description-sample):

```
{
    "@context": "https://www.w3.org/2019/wot/td/v1",
    "id": "urn:dev:ops:32473-WoTLamp-1234",
    "title": "MyLampThing",
    "securityDefinitions": {
        "basic_sc": {"scheme": "basic", "in":"header"}
    },
    "security": ["basic_sc"],
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
            "data": {"type": "string"},
            "forms": [{
                "href": "https://mylamp.example.com/oh",
                "subprotocol": "longpoll"
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
    id="urn:dev:ops:32473-WoTLamp-1234"
    title="MyLampThing">
  <security>basic_sc</security>
  <properties
      id="status"
      type="string">
    <forms _href="https://mylamp.example.com/status"/>
  </properties>
  <actions id="toggle">
    <forms _href="https://mylamp.example.com/toggle"/>
  </actions>
  <events id="overheating">
    <forms _href="https://mylamp.example.com/oh"
        subProtocol="longpoll"/>
    <data xsi:type="td:StringSchema"/>
  </events>
  <securityDefinitions
      xsi:type="td:BasicSecurityScheme"
      id="basic_sc"
      scheme="basic"
      in="header"/>
</td:Thing>
```
