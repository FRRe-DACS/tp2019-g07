import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { LoginComponent } from './Componente/login/login.component';
import { WelcomeComponent } from './Componente/welcome/welcome.component';
import { ErrorComponent } from './Componente/error/error.component';
import { TramiteComponent } from './Componente/tramite/tramite.component';
import {EstudioComponent } from './Componente/estudio/estudio.component'
import { FormularioEstudioComponent } from './Componente/formulario-estudio/formulario-estudio.component';
import { RecetaComponent } from './Componente/receta/receta.component';

// welcome
const routes: Routes = [
  { path: '', component: LoginComponent},
  { path: 'login', component: LoginComponent},
  { path: 'welcome/:nombre', component: WelcomeComponent},
  { path: 'mistramites', component: TramiteComponent},
  { path: 'mistramites/misestudios/:id', component: EstudioComponent},
  { path: 'mistramites/misnuevosestudios/:id', component: FormularioEstudioComponent},
  { path: 'misrecetas', component: RecetaComponent },
  { path: '**', component: ErrorComponent}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
