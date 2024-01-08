import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AtualizarTransporteComponent } from './atualizar-transporte.component';

describe('AtualizarTransporteComponent', () => {
  let component: AtualizarTransporteComponent;
  let fixture: ComponentFixture<AtualizarTransporteComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [AtualizarTransporteComponent]
    });
    fixture = TestBed.createComponent(AtualizarTransporteComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
