import './App.css';
import {useState} from 'react';
//function App() {
const App = props=>{
  const [color, setColor] = useState('black');
  return (
    <div>
      <h1 style={{color:color}}>리엑트 프로젝트 데모</h1>
      <hr/>
      <button onClick={()=>setColor('black')}>black</button>
      <button onClick={()=>setColor('red')}>red</button>
      <button onClick={()=>setColor('blue')}>blue</button>
    </div>
  );
}

export default App;
