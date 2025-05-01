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

val Iconsax.Outline.Next: ImageVector
    get() {
        if (_Next != null) {
            return _Next!!
        }
        _Next = ImageVector.Builder(
            name = "Outline.Next",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(6.31f, 20.09f)
                curveTo(5.74f, 20.09f, 5.18f, 19.94f, 4.66f, 19.64f)
                curveTo(3.62f, 19.04f, 3.01f, 17.98f, 3.01f, 16.78f)
                verticalLineTo(7.21f)
                curveTo(3.01f, 6.02f, 3.63f, 4.95f, 4.66f, 4.35f)
                curveTo(5.7f, 3.75f, 6.93f, 3.75f, 7.96f, 4.35f)
                lineTo(16.25f, 9.13f)
                curveTo(17.28f, 9.73f, 17.9f, 10.8f, 17.9f, 11.99f)
                curveTo(17.9f, 13.18f, 17.28f, 14.25f, 16.25f, 14.85f)
                lineTo(7.96f, 19.63f)
                curveTo(7.44f, 19.94f, 6.88f, 20.09f, 6.31f, 20.09f)
                close()
                moveTo(6.31f, 5.41f)
                curveTo(6f, 5.41f, 5.69f, 5.49f, 5.41f, 5.65f)
                curveTo(4.85f, 5.98f, 4.51f, 6.56f, 4.51f, 7.21f)
                verticalLineTo(16.78f)
                curveTo(4.51f, 17.43f, 4.85f, 18.01f, 5.41f, 18.34f)
                curveTo(5.97f, 18.66f, 6.65f, 18.67f, 7.21f, 18.34f)
                lineTo(15.5f, 13.56f)
                curveTo(16.06f, 13.23f, 16.4f, 12.65f, 16.4f, 12f)
                curveTo(16.4f, 11.35f, 16.06f, 10.77f, 15.5f, 10.44f)
                lineTo(7.21f, 5.66f)
                curveTo(6.93f, 5.5f, 6.62f, 5.41f, 6.31f, 5.41f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20.24f, 18.93f)
                curveTo(19.83f, 18.93f, 19.49f, 18.59f, 19.49f, 18.18f)
                verticalLineTo(5.82f)
                curveTo(19.49f, 5.41f, 19.83f, 5.07f, 20.24f, 5.07f)
                curveTo(20.65f, 5.07f, 20.99f, 5.41f, 20.99f, 5.82f)
                verticalLineTo(18.18f)
                curveTo(20.99f, 18.59f, 20.66f, 18.93f, 20.24f, 18.93f)
                close()
            }
        }.build()

        return _Next!!
    }

@Suppress("ObjectPropertyName")
private var _Next: ImageVector? = null
