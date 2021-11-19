# SCS3203/IS3108 Middleware Architecture Assignment - 18000657

## 1. How to build and/or deploy the API

## i. Build the project

    ./gradlew build

## ii. Deploy and run the project

    java -jar build/PetStore-runner.jar
    
## 2. How to run test suite

    ./gradlew test

## 3. How to run a CURL/WGET command to test the APIs once deployed

### Pets
#### View all pets
       curl -XGET -H "Content-type: application/json" 'http://localhost:8080/data/pets'
       
#### Add new pet
       curl -XPOST -H "Content-type: application/json" -d '{"age": 3,"name":"rocky","type":"Dog"}' 'http://localhost:8080/data/pets/add'
       
#### Update a pet
       curl -XPUT -H "Content-type: application/json" -d '{"age":4}' 'http://localhost:8080/data/pets/edit/2'
       
#### Delete a pet
       curl -XDELETE -H "Content-type: application/json" 'http://localhost:8080/data/pets/delete/3'

#### Search for a pet by id
       curl -XGET -H "Content-type: application/json" 'http://localhost:8080/data/pets/search?id=2'

#### Search for a pet by name
       curl -XGET -H "Content-type: application/json" 'http://localhost:8080/data/pets/search?name=Boola

#### Search for a pet by age
       curl -XGET -H "Content-type: application/json" 'http://localhost:8080/data/pets/search?id=2'curl -XGET -H "Content-type: application/json" 'http://localhost:8080/data/pets/search?age=4

### Pet types
#### View all pet types
       curl -XGET -H "Content-type: application/json" 'http://localhost:8080/data/pettypes'
       
#### Add new pet type
       curl -XPOST -H "Content-type: application/json" -d '{"petsQuantity": 3,"petType":"Fish"}' 'http://localhost:8080/data/pettypes/add'
       
#### Update a pet type
       curl -XPUT -H "Content-type: application/json" -d '{"petsQuantity":4}' 'http://localhost:8080/data/pettypes/edit/2'
       
#### Delete a pet type
       curl -XDELETE -H "Content-type: application/json" 'http://localhost:8080/data/pettypes/delete/3'
