import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AtualizarAtletaComponent } from './atualizar-atleta.component';

describe('AtualizarAtletaComponent', () => {
  let component: AtualizarAtletaComponent;
  let fixture: ComponentFixture<AtualizarAtletaComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [AtualizarAtletaComponent]
    });
    fixture = TestBed.createComponent(AtualizarAtletaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
