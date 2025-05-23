import {Component} from 'react'
import './Style.css'

 export class ParentToChild extends Component{

    state={eid:100,ename:"Hawkings",esal:9283423,eadd:"hyderabad"}

    render(){
        return(<div className='Parent'>
            <center><h1>Iam from the parent Component</h1></center>

            <Child eid={this.state.eid} ename={this.state.ename} esal={this.state.esal} eadd={this.state.eadd}/>

        </div>);
    }

}

export class Child extends Component{
    render(){
        return(<div className='Child'>
            <center><h1>Iam from the Child Component</h1></center>

            <h3>Eid:- {this.props.eid}</h3>
            <h3>Ename :- {this.props.ename}</h3>
            <h3>Esal:- {this.props.esal}</h3>
            <h3>Eadd:- {this.props.eadd}</h3>


        </div>);
    }
}