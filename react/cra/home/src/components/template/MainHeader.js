//헤더 컴포넌트
import ContextStore from '../../utilities/ContextStore';
import { useContext } from 'react';
const MainHeader = props=>{
    // 외부에 ContextStore라고 만든 저장소를 불러와서 사용
    // - useContext(저장소 객체)
    const store = useContext(ContextStore);
    console.log(store);
    return (
        <>
            <div>
                <h1>Header!{store}</h1>
            </div>
        </>
    );
};

export default MainHeader;