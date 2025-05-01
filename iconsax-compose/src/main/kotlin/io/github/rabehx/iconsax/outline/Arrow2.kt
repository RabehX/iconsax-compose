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

val Iconsax.Outline.Arrow2: ImageVector
    get() {
        if (_Arrow2 != null) {
            return _Arrow2!!
        }
        _Arrow2 = ImageVector.Builder(
            name = "Outline.Arrow2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.279f, 11.2f)
                curveTo(17.089f, 11.2f, 16.899f, 11.13f, 16.749f, 10.98f)
                curveTo(16.459f, 10.69f, 16.459f, 10.21f, 16.749f, 9.92f)
                lineTo(19.939f, 6.73f)
                lineTo(16.749f, 3.54f)
                curveTo(16.459f, 3.25f, 16.459f, 2.77f, 16.749f, 2.48f)
                curveTo(17.039f, 2.19f, 17.519f, 2.19f, 17.809f, 2.48f)
                lineTo(21.529f, 6.2f)
                curveTo(21.669f, 6.34f, 21.749f, 6.53f, 21.749f, 6.73f)
                curveTo(21.749f, 6.93f, 21.669f, 7.12f, 21.529f, 7.26f)
                lineTo(17.809f, 10.98f)
                curveTo(17.659f, 11.12f, 17.469f, 11.2f, 17.279f, 11.2f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(21f, 7.48f)
                horizontalLineTo(3f)
                curveTo(2.59f, 7.48f, 2.25f, 7.14f, 2.25f, 6.73f)
                curveTo(2.25f, 6.32f, 2.59f, 5.98f, 3f, 5.98f)
                horizontalLineTo(21f)
                curveTo(21.41f, 5.98f, 21.75f, 6.32f, 21.75f, 6.73f)
                curveTo(21.75f, 7.14f, 21.41f, 7.48f, 21f, 7.48f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(6.72f, 21.75f)
                curveTo(6.53f, 21.75f, 6.34f, 21.68f, 6.19f, 21.53f)
                lineTo(2.47f, 17.81f)
                curveTo(2.33f, 17.67f, 2.25f, 17.48f, 2.25f, 17.28f)
                curveTo(2.25f, 17.08f, 2.33f, 16.89f, 2.47f, 16.75f)
                lineTo(6.19f, 13.03f)
                curveTo(6.48f, 12.74f, 6.96f, 12.74f, 7.25f, 13.03f)
                curveTo(7.54f, 13.32f, 7.54f, 13.8f, 7.25f, 14.09f)
                lineTo(4.06f, 17.28f)
                lineTo(7.25f, 20.47f)
                curveTo(7.54f, 20.76f, 7.54f, 21.24f, 7.25f, 21.53f)
                curveTo(7.11f, 21.68f, 6.92f, 21.75f, 6.72f, 21.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(21f, 18.02f)
                horizontalLineTo(3f)
                curveTo(2.59f, 18.02f, 2.25f, 17.68f, 2.25f, 17.27f)
                curveTo(2.25f, 16.86f, 2.59f, 16.52f, 3f, 16.52f)
                horizontalLineTo(21f)
                curveTo(21.41f, 16.52f, 21.75f, 16.86f, 21.75f, 17.27f)
                curveTo(21.75f, 17.68f, 21.41f, 18.02f, 21f, 18.02f)
                close()
            }
        }.build()

        return _Arrow2!!
    }

@Suppress("ObjectPropertyName")
private var _Arrow2: ImageVector? = null
