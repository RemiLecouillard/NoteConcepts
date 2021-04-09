import React from 'react';
import { getConcepts } from '../../services/ConceptApi';
import RatingCard from '../RatingCard/RatingCard';


/*
concepts format :

concepts = [
  {
    name : blabla,
    description : blabla
  },{
    name : blablabla,
    desciption : balblablejdaledalkdja
  }
]
*/
export default class ConceptFeed extends React.Component{
  constructor() {
    super();
    this.state = {
      concepts: []
    }
  }
  componentDidMount() {
    getConcepts().then(responseData => {
      console.log(Object.values(responseData));
      this.setState({concepts : responseData})
    })
  }
  render(){
    return this.state.concepts.map((tile) => (<RatingCard concept={tile.name} description={tile.description}/>));
  }
}

/*
export default function ConceptFeed() {
  const [concepts,setConcepts] = useState([]);
  

  useEffect(() => {
      getConcepts().then(responseData => {
    setConcepts(responseData);
    const grid = document.getElementById("grid");
    grid.innerHTML = concepts.map((tile) => (
      <GridListTile key={tile.name}>
        <RatingCard concept={tile.name} description={tile.description}/>
      </GridListTile>
        ))
    console.log(concepts)
  });
  });

*/
