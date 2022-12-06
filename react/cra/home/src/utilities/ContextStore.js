// Context API를 사용하여 컴포넌트에서 모드 접근 및 변경이 가능한 저장소를 구현

import {createContext} from "react";

// - react에 내장된 createContext라는 함수로 저장소를 생성
// 생성 시 저장소에 초기값을 설정할 수 있으며, 나중에 변경 가능, null 설정 가능
const ContextStore = createContext(null);

export default ContextStore;

const ContextCustomProvide = props=>{
    return(
        <ContextStore.Provider>
            <props.children/>
        </ContextStore.Provider>
    );
};