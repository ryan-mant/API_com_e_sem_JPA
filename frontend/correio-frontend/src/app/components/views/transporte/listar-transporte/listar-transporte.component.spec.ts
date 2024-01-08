import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListarTransporteComponent } from './listar-transporte.component';

describe('ListarTransporteComponent', () => {
  let component: ListarTransporteComponent;
  let fixture: ComponentFixture<ListarTransporteComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [ListarTransporteComponent]
    });
    fixture = TestBed.createComponent(ListarTransporteComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
