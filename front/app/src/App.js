import star from './star.svg';
import './App.css';
import GradeCard from './components/GradeCard/GradeCard.js';

function App() {
  return (
    <div className="App">
      <header className="App-header">
        <img src={star} className="App-logo" alt="logo" />
        <div>
          <GradeCard concept="La vie" description="la chose qu'on est en vie" image_url="https://www.pourquoidocteur.fr/media/article/thunbs/uploded_reprise-vie-en-main-(cp---antonioguillem)-1598536855.jpg"/>
          <GradeCard concept="l'entropie" description="le truc qui fait que ça se mélange" image_url="https://149366099.v2.pressablecdn.com/wp-content/uploads/2018/11/Entropy.png"/>
          <GradeCard concept="Le football" description="le sport de Zidane"/>
        </div>
      </header>
    </div>
  );
}

export default App;
