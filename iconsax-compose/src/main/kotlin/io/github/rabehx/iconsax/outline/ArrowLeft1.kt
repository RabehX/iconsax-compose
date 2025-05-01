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

val Iconsax.Outline.ArrowLeft1: ImageVector
    get() {
        if (_ArrowLeft1 != null) {
            return _ArrowLeft1!!
        }
        _ArrowLeft1 = ImageVector.Builder(
            name = "Outline.ArrowLeft1",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15.1f, 19.15f)
                curveTo(14.26f, 19.15f, 13.34f, 18.88f, 12.41f, 18.34f)
                lineTo(7.78f, 15.67f)
                curveTo(6.15f, 14.72f, 5.25f, 13.42f, 5.25f, 12f)
                curveTo(5.25f, 10.58f, 6.15f, 9.28f, 7.78f, 8.34f)
                lineTo(12.41f, 5.67f)
                curveTo(14.04f, 4.73f, 15.61f, 4.6f, 16.85f, 5.31f)
                curveTo(18.08f, 6.02f, 18.76f, 7.45f, 18.76f, 9.33f)
                verticalLineTo(14.67f)
                curveTo(18.76f, 16.55f, 18.08f, 17.98f, 16.85f, 18.69f)
                curveTo(16.32f, 19f, 15.73f, 19.15f, 15.1f, 19.15f)
                close()
                moveTo(15.1f, 6.36f)
                curveTo(14.52f, 6.36f, 13.86f, 6.56f, 13.16f, 6.97f)
                lineTo(8.53f, 9.64f)
                curveTo(7.38f, 10.3f, 6.75f, 11.14f, 6.75f, 12f)
                curveTo(6.75f, 12.86f, 7.38f, 13.7f, 8.53f, 14.36f)
                lineTo(13.16f, 17.03f)
                curveTo(14.31f, 17.69f, 15.35f, 17.82f, 16.1f, 17.39f)
                curveTo(16.85f, 16.96f, 17.26f, 15.99f, 17.26f, 14.67f)
                verticalLineTo(9.33f)
                curveTo(17.26f, 8.01f, 16.85f, 7.04f, 16.1f, 6.61f)
                curveTo(15.8f, 6.44f, 15.46f, 6.36f, 15.1f, 6.36f)
                close()
            }
        }.build()

        return _ArrowLeft1!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowLeft1: ImageVector? = null
