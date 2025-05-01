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

val Iconsax.Outline.VideoSquare: ImageVector
    get() {
        if (_VideoSquare != null) {
            return _VideoSquare!!
        }
        _VideoSquare = ImageVector.Builder(
            name = "Outline.VideoSquare",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15f, 22.75f)
                horizontalLineTo(9f)
                curveTo(3.57f, 22.75f, 1.25f, 20.43f, 1.25f, 15f)
                verticalLineTo(9f)
                curveTo(1.25f, 3.57f, 3.57f, 1.25f, 9f, 1.25f)
                horizontalLineTo(15f)
                curveTo(20.43f, 1.25f, 22.75f, 3.57f, 22.75f, 9f)
                verticalLineTo(15f)
                curveTo(22.75f, 20.43f, 20.43f, 22.75f, 15f, 22.75f)
                close()
                moveTo(9f, 2.75f)
                curveTo(4.39f, 2.75f, 2.75f, 4.39f, 2.75f, 9f)
                verticalLineTo(15f)
                curveTo(2.75f, 19.61f, 4.39f, 21.25f, 9f, 21.25f)
                horizontalLineTo(15f)
                curveTo(19.61f, 21.25f, 21.25f, 19.61f, 21.25f, 15f)
                verticalLineTo(9f)
                curveTo(21.25f, 4.39f, 19.61f, 2.75f, 15f, 2.75f)
                horizontalLineTo(9f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(10.76f, 16.37f)
                curveTo(10.34f, 16.37f, 9.95f, 16.27f, 9.6f, 16.07f)
                curveTo(8.8f, 15.61f, 8.34f, 14.67f, 8.34f, 13.48f)
                verticalLineTo(10.52f)
                curveTo(8.34f, 9.34f, 8.8f, 8.39f, 9.6f, 7.93f)
                curveTo(10.4f, 7.47f, 11.44f, 7.54f, 12.47f, 8.14f)
                lineTo(15.04f, 9.62f)
                curveTo(16.06f, 10.21f, 16.65f, 11.08f, 16.65f, 12f)
                curveTo(16.65f, 12.92f, 16.06f, 13.79f, 15.04f, 14.38f)
                lineTo(12.47f, 15.86f)
                curveTo(11.89f, 16.2f, 11.3f, 16.37f, 10.76f, 16.37f)
                close()
                moveTo(10.77f, 9.13f)
                curveTo(10.61f, 9.13f, 10.47f, 9.16f, 10.36f, 9.23f)
                curveTo(10.04f, 9.42f, 9.85f, 9.89f, 9.85f, 10.52f)
                verticalLineTo(13.48f)
                curveTo(9.85f, 14.11f, 10.03f, 14.58f, 10.36f, 14.77f)
                curveTo(10.68f, 14.96f, 11.18f, 14.88f, 11.73f, 14.56f)
                lineTo(14.3f, 13.08f)
                curveTo(14.85f, 12.76f, 15.16f, 12.37f, 15.16f, 12f)
                curveTo(15.16f, 11.63f, 14.85f, 11.23f, 14.3f, 10.92f)
                lineTo(11.73f, 9.44f)
                curveTo(11.37f, 9.23f, 11.04f, 9.13f, 10.77f, 9.13f)
                close()
            }
        }.build()

        return _VideoSquare!!
    }

@Suppress("ObjectPropertyName")
private var _VideoSquare: ImageVector? = null
