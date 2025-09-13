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

val Iconsax.Outline.Send1: ImageVector
    get() {
        if (_Send1 != null) {
            return _Send1!!
        }
        _Send1 = ImageVector.Builder(
            name = "Outline.Send1",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(5.41f, 21.75f)
                curveTo(4.29f, 21.75f, 3.58f, 21.37f, 3.13f, 20.92f)
                curveTo(2.25f, 20.04f, 1.63f, 18.17f, 3.61f, 14.2f)
                lineTo(4.48f, 12.47f)
                curveTo(4.59f, 12.24f, 4.59f, 11.76f, 4.48f, 11.53f)
                lineTo(3.61f, 9.8f)
                curveTo(1.62f, 5.83f, 2.25f, 3.95f, 3.13f, 3.08f)
                curveTo(4f, 2.2f, 5.88f, 1.57f, 9.84f, 3.56f)
                lineTo(18.4f, 7.84f)
                curveTo(20.53f, 8.9f, 21.7f, 10.38f, 21.7f, 12f)
                curveTo(21.7f, 13.62f, 20.53f, 15.1f, 18.41f, 16.16f)
                lineTo(9.85f, 20.44f)
                curveTo(7.91f, 21.41f, 6.47f, 21.75f, 5.41f, 21.75f)
                close()
                moveTo(5.41f, 3.75f)
                curveTo(4.87f, 3.75f, 4.45f, 3.88f, 4.19f, 4.14f)
                curveTo(3.46f, 4.86f, 3.75f, 6.73f, 4.95f, 9.12f)
                lineTo(5.82f, 10.86f)
                curveTo(6.14f, 11.51f, 6.14f, 12.49f, 5.82f, 13.14f)
                lineTo(4.95f, 14.87f)
                curveTo(3.75f, 17.27f, 3.46f, 19.13f, 4.19f, 19.85f)
                curveTo(4.91f, 20.58f, 6.78f, 20.29f, 9.18f, 19.09f)
                lineTo(17.74f, 14.81f)
                curveTo(19.31f, 14.03f, 20.2f, 13f, 20.2f, 11.99f)
                curveTo(20.2f, 10.98f, 19.3f, 9.95f, 17.73f, 9.17f)
                lineTo(9.17f, 4.9f)
                curveTo(7.65f, 4.14f, 6.34f, 3.75f, 5.41f, 3.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(10.84f, 12.75f)
                horizontalLineTo(5.439f)
                curveTo(5.029f, 12.75f, 4.689f, 12.41f, 4.689f, 12f)
                curveTo(4.689f, 11.59f, 5.029f, 11.25f, 5.439f, 11.25f)
                horizontalLineTo(10.84f)
                curveTo(11.25f, 11.25f, 11.59f, 11.59f, 11.59f, 12f)
                curveTo(11.59f, 12.41f, 11.25f, 12.75f, 10.84f, 12.75f)
                close()
            }
        }.build()

        return _Send1!!
    }

@Suppress("ObjectPropertyName")
private var _Send1: ImageVector? = null
