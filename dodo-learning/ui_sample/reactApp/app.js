import React from "react";
import ReactDOM from "react-dom";
import { MyComponent } from "./hello";
import { createStore } from 'redux'
import todoApp from './reducers'
import {addTodo} from './actions'
import deviceReducer from './device_reducer'
import { addDevice, removeDevice } from './actions'


const store = createStore(deviceReducer)
const unsubscribe = store.subscribe(() => console.log(store.getState()))

store.dispatch(addDevice({id:1,name:"eWLC 1"}))

const element = document.getElementById('root');
ReactDOM.render(
  <MyComponent />, element
);
