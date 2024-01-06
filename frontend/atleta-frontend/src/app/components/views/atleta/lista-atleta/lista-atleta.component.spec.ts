import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListaAtletaComponent } from './lista-atleta.component';

describe('ListaAtletaComponent', () => {
  let component: ListaAtletaComponent;
  let fixture: ComponentFixture<ListaAtletaComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [ListaAtletaComponent]
    });
    fixture = TestBed.createComponent(ListaAtletaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
