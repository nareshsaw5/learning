import { combineReducers } from 'redux';

function device(state = [], action){
    switch(action.type){
        case "ADD_DEVICE":
            return Object.assign({}, state, action.device);
        default:
            return state;    
    }
}

const deviceReducer = combineReducers( { device })
export default deviceReducer;