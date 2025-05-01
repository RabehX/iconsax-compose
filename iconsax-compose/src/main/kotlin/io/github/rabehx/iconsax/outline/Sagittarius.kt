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

val Iconsax.Outline.Sagittarius: ImageVector
    get() {
        if (_Sagittarius != null) {
            return _Sagittarius!!
        }
        _Sagittarius = ImageVector.Builder(
            name = "Outline.Sagittarius",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(21f, 12.75f)
                curveTo(20.59f, 12.75f, 20.25f, 12.41f, 20.25f, 12f)
                verticalLineTo(3.75f)
                horizontalLineTo(12f)
                curveTo(11.59f, 3.75f, 11.25f, 3.41f, 11.25f, 3f)
                curveTo(11.25f, 2.59f, 11.59f, 2.25f, 12f, 2.25f)
                horizontalLineTo(21f)
                curveTo(21.41f, 2.25f, 21.75f, 2.59f, 21.75f, 3f)
                verticalLineTo(12f)
                curveTo(21.75f, 12.41f, 21.41f, 12.75f, 21f, 12.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(2.999f, 21.75f)
                curveTo(2.809f, 21.75f, 2.619f, 21.68f, 2.469f, 21.53f)
                curveTo(2.179f, 21.24f, 2.179f, 20.76f, 2.469f, 20.47f)
                lineTo(20.469f, 2.47f)
                curveTo(20.76f, 2.18f, 21.24f, 2.18f, 21.529f, 2.47f)
                curveTo(21.819f, 2.76f, 21.819f, 3.24f, 21.529f, 3.53f)
                lineTo(3.53f, 21.53f)
                curveTo(3.38f, 21.68f, 3.189f, 21.75f, 2.999f, 21.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.4f, 18.15f)
                curveTo(17.21f, 18.15f, 17.02f, 18.08f, 16.87f, 17.93f)
                lineTo(6.07f, 7.13f)
                curveTo(5.78f, 6.84f, 5.78f, 6.36f, 6.07f, 6.07f)
                curveTo(6.36f, 5.78f, 6.84f, 5.78f, 7.13f, 6.07f)
                lineTo(17.93f, 16.87f)
                curveTo(18.22f, 17.16f, 18.22f, 17.64f, 17.93f, 17.93f)
                curveTo(17.78f, 18.08f, 17.59f, 18.15f, 17.4f, 18.15f)
                close()
            }
        }.build()

        return _Sagittarius!!
    }

@Suppress("ObjectPropertyName")
private var _Sagittarius: ImageVector? = null
