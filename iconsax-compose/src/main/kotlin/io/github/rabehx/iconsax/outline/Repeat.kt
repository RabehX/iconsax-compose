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

val Iconsax.Outline.Repeat: ImageVector
    get() {
        if (_Repeat != null) {
            return _Repeat!!
        }
        _Repeat = ImageVector.Builder(
            name = "Outline.Repeat",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20.42f, 12.22f)
                curveTo(20.01f, 12.22f, 19.67f, 11.88f, 19.67f, 11.47f)
                verticalLineTo(8.15f)
                curveTo(19.67f, 6.91f, 18.66f, 5.9f, 17.42f, 5.9f)
                horizontalLineTo(3.58f)
                curveTo(3.17f, 5.9f, 2.83f, 5.56f, 2.83f, 5.15f)
                curveTo(2.83f, 4.74f, 3.17f, 4.4f, 3.58f, 4.4f)
                horizontalLineTo(17.42f)
                curveTo(19.49f, 4.4f, 21.17f, 6.08f, 21.17f, 8.15f)
                verticalLineTo(11.47f)
                curveTo(21.17f, 11.89f, 20.83f, 12.22f, 20.42f, 12.22f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(6.74f, 9.07f)
                curveTo(6.55f, 9.07f, 6.36f, 9f, 6.21f, 8.85f)
                lineTo(3.05f, 5.69f)
                curveTo(2.91f, 5.55f, 2.83f, 5.36f, 2.83f, 5.16f)
                curveTo(2.83f, 4.96f, 2.91f, 4.77f, 3.05f, 4.63f)
                lineTo(6.21f, 1.47f)
                curveTo(6.5f, 1.18f, 6.98f, 1.18f, 7.27f, 1.47f)
                curveTo(7.56f, 1.76f, 7.56f, 2.24f, 7.27f, 2.53f)
                lineTo(4.64f, 5.16f)
                lineTo(7.27f, 7.79f)
                curveTo(7.56f, 8.08f, 7.56f, 8.56f, 7.27f, 8.85f)
                curveTo(7.12f, 8.99f, 6.93f, 9.07f, 6.74f, 9.07f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20.42f, 19.59f)
                horizontalLineTo(6.58f)
                curveTo(4.51f, 19.59f, 2.83f, 17.91f, 2.83f, 15.84f)
                verticalLineTo(12.52f)
                curveTo(2.83f, 12.11f, 3.17f, 11.77f, 3.58f, 11.77f)
                curveTo(3.99f, 11.77f, 4.33f, 12.11f, 4.33f, 12.52f)
                verticalLineTo(15.84f)
                curveTo(4.33f, 17.08f, 5.34f, 18.09f, 6.58f, 18.09f)
                horizontalLineTo(20.42f)
                curveTo(20.83f, 18.09f, 21.17f, 18.43f, 21.17f, 18.84f)
                curveTo(21.17f, 19.25f, 20.83f, 19.59f, 20.42f, 19.59f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.259f, 22.75f)
                curveTo(17.069f, 22.75f, 16.879f, 22.68f, 16.729f, 22.53f)
                curveTo(16.439f, 22.24f, 16.439f, 21.76f, 16.729f, 21.47f)
                lineTo(19.359f, 18.84f)
                lineTo(16.729f, 16.21f)
                curveTo(16.439f, 15.92f, 16.439f, 15.44f, 16.729f, 15.15f)
                curveTo(17.019f, 14.86f, 17.499f, 14.86f, 17.789f, 15.15f)
                lineTo(20.949f, 18.31f)
                curveTo(21.089f, 18.45f, 21.169f, 18.64f, 21.169f, 18.84f)
                curveTo(21.169f, 19.04f, 21.089f, 19.23f, 20.949f, 19.37f)
                lineTo(17.789f, 22.53f)
                curveTo(17.649f, 22.68f, 17.459f, 22.75f, 17.259f, 22.75f)
                close()
            }
        }.build()

        return _Repeat!!
    }

@Suppress("ObjectPropertyName")
private var _Repeat: ImageVector? = null
