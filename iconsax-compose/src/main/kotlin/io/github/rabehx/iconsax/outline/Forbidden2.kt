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

val Iconsax.Outline.Forbidden2: ImageVector
    get() {
        if (_Forbidden2 != null) {
            return _Forbidden2!!
        }
        _Forbidden2 = ImageVector.Builder(
            name = "Outline.Forbidden2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14.9f, 22.75f)
                horizontalLineTo(9.1f)
                curveTo(8.21f, 22.75f, 7.07f, 22.28f, 6.45f, 21.65f)
                lineTo(2.35f, 17.55f)
                curveTo(1.72f, 16.92f, 1.25f, 15.78f, 1.25f, 14.9f)
                verticalLineTo(9.1f)
                curveTo(1.25f, 8.21f, 1.72f, 7.07f, 2.35f, 6.45f)
                lineTo(6.45f, 2.35f)
                curveTo(7.08f, 1.72f, 8.22f, 1.25f, 9.1f, 1.25f)
                horizontalLineTo(14.9f)
                curveTo(15.79f, 1.25f, 16.93f, 1.72f, 17.55f, 2.35f)
                lineTo(21.65f, 6.45f)
                curveTo(22.28f, 7.08f, 22.75f, 8.22f, 22.75f, 9.1f)
                verticalLineTo(14.9f)
                curveTo(22.75f, 15.79f, 22.28f, 16.93f, 21.65f, 17.55f)
                lineTo(17.55f, 21.65f)
                curveTo(16.92f, 22.28f, 15.79f, 22.75f, 14.9f, 22.75f)
                close()
                moveTo(9.1f, 2.75f)
                curveTo(8.61f, 2.75f, 7.85f, 3.06f, 7.51f, 3.41f)
                lineTo(3.41f, 7.51f)
                curveTo(3.07f, 7.86f, 2.75f, 8.61f, 2.75f, 9.1f)
                verticalLineTo(14.9f)
                curveTo(2.75f, 15.39f, 3.06f, 16.15f, 3.41f, 16.49f)
                lineTo(7.51f, 20.59f)
                curveTo(7.86f, 20.93f, 8.61f, 21.25f, 9.1f, 21.25f)
                horizontalLineTo(14.9f)
                curveTo(15.39f, 21.25f, 16.15f, 20.94f, 16.49f, 20.59f)
                lineTo(20.59f, 16.49f)
                curveTo(20.93f, 16.14f, 21.25f, 15.39f, 21.25f, 14.9f)
                verticalLineTo(9.1f)
                curveTo(21.25f, 8.61f, 20.94f, 7.85f, 20.59f, 7.51f)
                lineTo(16.49f, 3.41f)
                curveTo(16.14f, 3.07f, 15.39f, 2.75f, 14.9f, 2.75f)
                horizontalLineTo(9.1f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8.499f, 16.25f)
                curveTo(8.309f, 16.25f, 8.119f, 16.18f, 7.969f, 16.03f)
                curveTo(7.679f, 15.74f, 7.679f, 15.26f, 7.969f, 14.97f)
                lineTo(14.969f, 7.97f)
                curveTo(15.259f, 7.68f, 15.74f, 7.68f, 16.029f, 7.97f)
                curveTo(16.319f, 8.26f, 16.319f, 8.74f, 16.029f, 9.03f)
                lineTo(9.029f, 16.03f)
                curveTo(8.879f, 16.18f, 8.689f, 16.25f, 8.499f, 16.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15.5f, 16.25f)
                curveTo(15.309f, 16.25f, 15.12f, 16.18f, 14.969f, 16.03f)
                lineTo(7.969f, 9.03f)
                curveTo(7.679f, 8.74f, 7.679f, 8.26f, 7.969f, 7.97f)
                curveTo(8.259f, 7.68f, 8.739f, 7.68f, 9.029f, 7.97f)
                lineTo(16.029f, 14.97f)
                curveTo(16.319f, 15.26f, 16.319f, 15.74f, 16.029f, 16.03f)
                curveTo(15.88f, 16.18f, 15.689f, 16.25f, 15.5f, 16.25f)
                close()
            }
        }.build()

        return _Forbidden2!!
    }

@Suppress("ObjectPropertyName")
private var _Forbidden2: ImageVector? = null
