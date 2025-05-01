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

val Iconsax.Outline.ArrowRight4: ImageVector
    get() {
        if (_ArrowRight4 != null) {
            return _ArrowRight4!!
        }
        _ArrowRight4 = ImageVector.Builder(
            name = "Outline.ArrowRight4",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8.9f, 19.15f)
                curveTo(8.27f, 19.15f, 7.68f, 19f, 7.16f, 18.7f)
                curveTo(5.93f, 17.99f, 5.25f, 16.56f, 5.25f, 14.68f)
                verticalLineTo(9.33f)
                curveTo(5.25f, 7.45f, 5.93f, 6.02f, 7.16f, 5.31f)
                curveTo(8.39f, 4.6f, 9.96f, 4.73f, 11.6f, 5.67f)
                lineTo(16.23f, 8.34f)
                curveTo(17.86f, 9.28f, 18.76f, 10.58f, 18.76f, 12f)
                curveTo(18.76f, 13.42f, 17.86f, 14.72f, 16.23f, 15.66f)
                lineTo(11.6f, 18.33f)
                curveTo(10.66f, 18.88f, 9.74f, 19.15f, 8.9f, 19.15f)
                close()
                moveTo(8.9f, 6.36f)
                curveTo(8.53f, 6.36f, 8.19f, 6.44f, 7.9f, 6.61f)
                curveTo(7.16f, 7.04f, 6.75f, 8f, 6.75f, 9.33f)
                verticalLineTo(14.67f)
                curveTo(6.75f, 15.99f, 7.16f, 16.96f, 7.91f, 17.39f)
                curveTo(8.66f, 17.82f, 9.7f, 17.69f, 10.85f, 17.03f)
                lineTo(15.48f, 14.36f)
                curveTo(16.63f, 13.7f, 17.26f, 12.86f, 17.26f, 12f)
                curveTo(17.26f, 11.14f, 16.63f, 10.3f, 15.48f, 9.64f)
                lineTo(10.85f, 6.97f)
                curveTo(10.14f, 6.56f, 9.48f, 6.36f, 8.9f, 6.36f)
                close()
            }
        }.build()

        return _ArrowRight4!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowRight4: ImageVector? = null
