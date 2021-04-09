/*
export async function get(url){

  let response
  let headers = {}
  headers['Content-Type'] = 'application/json'
  try{
    response = await fetch(
      url, {method:"GET", credentials:'same-origin', headers:headers}
    )
  }catch(err){
    if(err instanceof DOMException && err.name === 'AbortError'){
      console.log("y33t")
      throw err
    }
  }
  if (response.ok) {
    await response.then(resp => {
      return resp.json()
    })
  }

}*/


// const sendRequest = (url, method, data) => {
//   return fetch(url, {
//     method:method,
//     body: JSON.stringify(data),
//     headers: data ? { 'Content-Type': 'application/json'} : {}
//   }).then(response => {
//     if(response.status >=400){
//       throw new Error("Something went terribly wrong...");
//     }
//     return response.json();
//   }).catch(err => {
//     console.log(err);
//   })
// }

export const sendRequest = (method,url) => {
  const promise = new Promise((resolve,reject) => {
    const xhr = new XMLHttpRequest();
    xhr.open(method,url);
    xhr.responseType = 'json';
    xhr.onload =() => {
      resolve(xhr.response);
    }
    xhr.send();    
  });
  return promise;
};


 
