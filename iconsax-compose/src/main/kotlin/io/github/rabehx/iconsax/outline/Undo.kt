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

val Iconsax.Outline.Undo: ImageVector
    get() {
        if (_Undo != null) {
            return _Undo!!
        }
        _Undo = ImageVector.Builder(
            name = "Outline.Undo",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15.131f, 19.06f)
                horizontalLineTo(7.131f)
                curveTo(6.721f, 19.06f, 6.381f, 18.72f, 6.381f, 18.31f)
                curveTo(6.381f, 17.9f, 6.721f, 17.56f, 7.131f, 17.56f)
                horizontalLineTo(15.131f)
                curveTo(17.471f, 17.56f, 19.381f, 15.65f, 19.381f, 13.31f)
                curveTo(19.381f, 10.97f, 17.471f, 9.06f, 15.131f, 9.06f)
                horizontalLineTo(4.131f)
                curveTo(3.721f, 9.06f, 3.381f, 8.72f, 3.381f, 8.31f)
                curveTo(3.381f, 7.9f, 3.721f, 7.56f, 4.131f, 7.56f)
                horizontalLineTo(15.131f)
                curveTo(18.301f, 7.56f, 20.881f, 10.14f, 20.881f, 13.31f)
                curveTo(20.881f, 16.48f, 18.301f, 19.06f, 15.131f, 19.06f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(6.431f, 11.56f)
                curveTo(6.241f, 11.56f, 6.051f, 11.49f, 5.901f, 11.34f)
                lineTo(3.341f, 8.78f)
                curveTo(3.051f, 8.49f, 3.051f, 8.01f, 3.341f, 7.72f)
                lineTo(5.901f, 5.16f)
                curveTo(6.191f, 4.87f, 6.671f, 4.87f, 6.961f, 5.16f)
                curveTo(7.251f, 5.45f, 7.251f, 5.93f, 6.961f, 6.22f)
                lineTo(4.931f, 8.25f)
                lineTo(6.961f, 10.28f)
                curveTo(7.251f, 10.57f, 7.251f, 11.05f, 6.961f, 11.34f)
                curveTo(6.821f, 11.49f, 6.621f, 11.56f, 6.431f, 11.56f)
                close()
            }
        }.build()

        return _Undo!!
    }

@Suppress("ObjectPropertyName")
private var _Undo: ImageVector? = null
