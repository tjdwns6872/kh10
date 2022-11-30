import MainHeader from './components/templte/MainHeader';
import MainMenu from './components/templte/MainMenu';
import MainFooter from './components/templte/MainFooter';
import MainPage from './page/MainPage';
import './App.css';
const App = props=>{
  return (
    <>
      {/*헤더, 메뉴, 본문, 푸터 등으로 컴포넌트를 분할해야 함*/}
      <MainHeader/>
      <MainMenu/>
      <MainPage/>
      <MainFooter/>
    </>
  );
}

export default App;
