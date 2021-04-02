import React from 'react';

import RatingCard from './components/RatingCard/RatingCard.js';
import NavBar from './components/NavBar/NavBar';





function MainDisplayPage() {
    return (
      <div className="App">
        <header className="App-header">
          <NavBar/>
          <div>
            <RatingCard
              concept="La vie"
              description="la chose qu'on est en vie"
              image_url="https://www.pourquoidocteur.fr/media/article/thunbs/uploded_reprise-vie-en-main-(cp---antonioguillem)-1598536855.jpg"/>
            <RatingCard
              concept="l'entropie"
              description="le truc qui fait que ça se mélange"
              image_url="https://149366099.v2.pressablecdn.com/wp-content/uploads/2018/11/Entropy.png"/>
            <RatingCard
              concept="Le football"
              description="le sport de Zidane"
              mean={4.7}/>
            <RatingCard
              concept="L'oxydoréduction"
              description="Une réaction d'oxydoréduction ou réaction redox est une réaction chimique au cours de laquelle se produit un transfert d'électrons. L'espèce chimique qui capte les électrons est appelée « oxydant » et celle qui les cède, « réducteur »."
              image_url="https://www.lachimie.net/images/alfereduc.jpg"
              mean={2.3}/>
          </div>
        </header>
      </div>
    );
  }

  export default MainDisplayPage;
