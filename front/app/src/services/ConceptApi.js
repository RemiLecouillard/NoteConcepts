import {sendRequest} from "./Utils.js"

const ROUTE_CONCEPTS = "http://localhost:8080/api/concepts"



export const getConcepts = () => {
    return sendRequest("GET",ROUTE_CONCEPTS);

}

