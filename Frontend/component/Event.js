import { Component } from "react";

class Event extends Component{

    state={name:"apple"}

render(){
    return(
        <div><br/><br/><br/>

        
        <input type="text" onChange={e=>{console.log(e.target.value)}}/><br/><br/>

            <h3>Please enter your name:-  <input type="text" onChange={e=>{this.setState({name:e.target.value})}}/></h3>

            <br/><br/><br/>

            <center><h2>Hello {this.state.name}....</h2></center>
        </div>
    );
}}

export default Event;