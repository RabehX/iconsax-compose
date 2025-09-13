/*
 *
 *  * Copyright (c) 2025, Рабeх Аззам
 *  *
 *  * This file is part of Iconsax Compose.
 *  *
 *  * Iconsax Compose is free software: you can redistribute it and/or modify
 *  * it under the terms of the GNU General Public License as published by
 *  * the Free Software Foundation, either version 3 of the License, or
 *  * (at your option) any later version.
 *  *
 *  * Iconsax Compose is distributed in the hope that it will be useful,
 *  * but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 *  * GNU General Public License for more details.
 *  *
 *  * You should have received a copy of the GNU General Public License
 *  * along with Iconsax Compose. If not, see <https://www.gnu.org/licenses/>.
 *
 */

package io.github.rabehx.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.rabehx.iconsax.Iconsax

val Iconsax.Outline.Radar1: ImageVector
    get() {
        if (_Radar1 != null) {
            return _Radar1!!
        }
        _Radar1 = ImageVector.Builder(
            name = "Outline.Radar1",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 14.75f)
                curveTo(10.48f, 14.75f, 9.25f, 13.52f, 9.25f, 12f)
                curveTo(9.25f, 10.48f, 10.48f, 9.25f, 12f, 9.25f)
                curveTo(13.52f, 9.25f, 14.75f, 10.48f, 14.75f, 12f)
                curveTo(14.75f, 13.52f, 13.52f, 14.75f, 12f, 14.75f)
                close()
                moveTo(12f, 10.75f)
                curveTo(11.31f, 10.75f, 10.75f, 11.31f, 10.75f, 12f)
                curveTo(10.75f, 12.69f, 11.31f, 13.25f, 12f, 13.25f)
                curveTo(12.69f, 13.25f, 13.25f, 12.69f, 13.25f, 12f)
                curveTo(13.25f, 11.31f, 12.69f, 10.75f, 12f, 10.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20f, 18.75f)
                curveTo(19.84f, 18.75f, 19.69f, 18.7f, 19.55f, 18.6f)
                curveTo(19.22f, 18.35f, 19.15f, 17.88f, 19.4f, 17.55f)
                curveTo(20.61f, 15.94f, 21.25f, 14.02f, 21.25f, 12f)
                curveTo(21.25f, 9.98f, 20.61f, 8.06f, 19.4f, 6.45f)
                curveTo(19.15f, 6.12f, 19.22f, 5.65f, 19.55f, 5.4f)
                curveTo(19.88f, 5.15f, 20.35f, 5.22f, 20.6f, 5.55f)
                curveTo(22.01f, 7.42f, 22.75f, 9.65f, 22.75f, 12f)
                curveTo(22.75f, 14.35f, 22.01f, 16.58f, 20.6f, 18.45f)
                curveTo(20.45f, 18.65f, 20.23f, 18.75f, 20f, 18.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(4f, 18.75f)
                curveTo(3.77f, 18.75f, 3.55f, 18.65f, 3.4f, 18.45f)
                curveTo(1.99f, 16.58f, 1.25f, 14.35f, 1.25f, 12f)
                curveTo(1.25f, 9.65f, 1.99f, 7.42f, 3.4f, 5.55f)
                curveTo(3.65f, 5.22f, 4.12f, 5.15f, 4.45f, 5.4f)
                curveTo(4.78f, 5.65f, 4.85f, 6.12f, 4.6f, 6.45f)
                curveTo(3.39f, 8.06f, 2.75f, 9.98f, 2.75f, 12f)
                curveTo(2.75f, 14.02f, 3.39f, 15.94f, 4.6f, 17.55f)
                curveTo(4.85f, 17.88f, 4.78f, 18.35f, 4.45f, 18.6f)
                curveTo(4.32f, 18.7f, 4.16f, 18.75f, 4f, 18.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.801f, 16.35f)
                curveTo(16.641f, 16.35f, 16.491f, 16.3f, 16.351f, 16.2f)
                curveTo(16.021f, 15.95f, 15.951f, 15.48f, 16.201f, 15.15f)
                curveTo(16.891f, 14.24f, 17.251f, 13.15f, 17.251f, 12f)
                curveTo(17.251f, 10.85f, 16.891f, 9.76f, 16.201f, 8.85f)
                curveTo(15.951f, 8.52f, 16.021f, 8.05f, 16.351f, 7.8f)
                curveTo(16.681f, 7.55f, 17.151f, 7.62f, 17.401f, 7.95f)
                curveTo(18.281f, 9.13f, 18.751f, 10.53f, 18.751f, 12f)
                curveTo(18.751f, 13.47f, 18.281f, 14.88f, 17.401f, 16.05f)
                curveTo(17.251f, 16.25f, 17.031f, 16.35f, 16.801f, 16.35f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(7.2f, 16.35f)
                curveTo(6.97f, 16.35f, 6.75f, 16.25f, 6.6f, 16.05f)
                curveTo(5.72f, 14.87f, 5.25f, 13.47f, 5.25f, 12f)
                curveTo(5.25f, 10.53f, 5.72f, 9.12f, 6.6f, 7.95f)
                curveTo(6.85f, 7.62f, 7.32f, 7.55f, 7.65f, 7.8f)
                curveTo(7.98f, 8.05f, 8.05f, 8.52f, 7.8f, 8.85f)
                curveTo(7.11f, 9.76f, 6.75f, 10.85f, 6.75f, 12f)
                curveTo(6.75f, 13.15f, 7.11f, 14.24f, 7.8f, 15.15f)
                curveTo(8.05f, 15.48f, 7.98f, 15.95f, 7.65f, 16.2f)
                curveTo(7.52f, 16.3f, 7.36f, 16.35f, 7.2f, 16.35f)
                close()
            }
        }.build()

        return _Radar1!!
    }

@Suppress("ObjectPropertyName")
private var _Radar1: ImageVector? = null
