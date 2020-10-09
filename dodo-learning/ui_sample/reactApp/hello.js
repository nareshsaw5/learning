import React from "react";

class Hello extends React.Component{
    constructor(props){
        super(props);
        this.state = {"country":"IN"}
        this.onClick = this.onClick.bind(this);
    }

    onClick(){
        console.log("I am clicked");
    }

    clickMe(){
        console.log("I am Clicked me");
    }

    render(){
        return(
            <div> Hello {this.props.name}.  State country is {this.state.country}. Props country is {this.props.country}
            <button onClick={this.onClick} >Click me</button>
            <button onClick={ () => this.clickMe() } >Click me</button>
            </div>
        )
    }
}


class MyComponent extends React.Component {
    constructor(props){
        super(props);
    }

    render(){
        return(
            <div>
                <Hello name="Naresh" country="Japan"/>
                <Hello name="Soni"/>
                <Hello name="Avinash"/>
            </div>
        )
    }
}
export { MyComponent, Hello };