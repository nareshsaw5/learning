import { combineReducers } from 'redux'

function counter(state = {counter:0}, action) {
    switch (action.type) {
        case "INCREASE":
            var count = increaseCount(state);
            return Object.assign({}, state, {"counter":count})
        default:
            return state;    
    }

}

function increaseCount( {counter}){
    return ++counter;
}
const counterApp = combineReducers({counter})
export default counterApp;