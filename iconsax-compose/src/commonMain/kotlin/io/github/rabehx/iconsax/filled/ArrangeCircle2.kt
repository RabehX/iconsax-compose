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

package io.github.rabehx.iconsax.filled


import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.rabehx.iconsax.Iconsax

val Iconsax.Filled.ArrangeCircle2: ImageVector
    get() {
        if (_ArrangeCircle2 != null) {
            return _ArrangeCircle2!!
        }
        _ArrangeCircle2 = ImageVector.Builder(
            name = "Filled.ArrangeCircle2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 2f)
                curveTo(6.48f, 2f, 2f, 6.48f, 2f, 12f)
                curveTo(2f, 17.52f, 6.48f, 22f, 12f, 22f)
                curveTo(17.52f, 22f, 22f, 17.52f, 22f, 12f)
                curveTo(22f, 6.48f, 17.52f, 2f, 12f, 2f)
                close()
                moveTo(17.85f, 14.1f)
                curveTo(17.81f, 14.19f, 17.76f, 14.27f, 17.69f, 14.34f)
                lineTo(14.65f, 17.38f)
                curveTo(14.5f, 17.53f, 14.31f, 17.6f, 14.12f, 17.6f)
                curveTo(13.93f, 17.6f, 13.74f, 17.53f, 13.59f, 17.38f)
                curveTo(13.3f, 17.09f, 13.3f, 16.61f, 13.59f, 16.32f)
                lineTo(15.35f, 14.56f)
                horizontalLineTo(6.85f)
                curveTo(6.44f, 14.56f, 6.1f, 14.22f, 6.1f, 13.81f)
                curveTo(6.1f, 13.4f, 6.44f, 13.06f, 6.85f, 13.06f)
                horizontalLineTo(17.16f)
                curveTo(17.26f, 13.06f, 17.35f, 13.08f, 17.45f, 13.12f)
                curveTo(17.63f, 13.2f, 17.78f, 13.34f, 17.86f, 13.53f)
                curveTo(17.92f, 13.71f, 17.92f, 13.92f, 17.85f, 14.1f)
                close()
                moveTo(17.15f, 10.93f)
                horizontalLineTo(6.85f)
                curveTo(6.75f, 10.93f, 6.65f, 10.91f, 6.56f, 10.87f)
                curveTo(6.38f, 10.79f, 6.23f, 10.65f, 6.15f, 10.46f)
                curveTo(6.07f, 10.28f, 6.07f, 10.07f, 6.15f, 9.89f)
                curveTo(6.19f, 9.8f, 6.24f, 9.72f, 6.31f, 9.65f)
                lineTo(9.35f, 6.61f)
                curveTo(9.64f, 6.32f, 10.12f, 6.32f, 10.41f, 6.61f)
                curveTo(10.7f, 6.9f, 10.7f, 7.38f, 10.41f, 7.67f)
                lineTo(8.66f, 9.43f)
                horizontalLineTo(17.16f)
                curveTo(17.57f, 9.43f, 17.91f, 9.77f, 17.91f, 10.18f)
                curveTo(17.91f, 10.59f, 17.57f, 10.93f, 17.15f, 10.93f)
                close()
            }
        }.build()

        return _ArrangeCircle2!!
    }

@Suppress("ObjectPropertyName")
private var _ArrangeCircle2: ImageVector? = null
