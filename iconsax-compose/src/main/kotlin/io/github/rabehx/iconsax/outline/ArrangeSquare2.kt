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

val Iconsax.Outline.ArrangeSquare2: ImageVector
    get() {
        if (_ArrangeSquare2 != null) {
            return _ArrangeSquare2!!
        }
        _ArrangeSquare2 = ImageVector.Builder(
            name = "Outline.ArrangeSquare2",
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
                moveTo(10.18f, 17.9f)
                curveTo(9.99f, 17.9f, 9.8f, 17.83f, 9.65f, 17.68f)
                lineTo(6.61f, 14.64f)
                curveTo(6.32f, 14.35f, 6.32f, 13.87f, 6.61f, 13.58f)
                curveTo(6.9f, 13.29f, 7.38f, 13.29f, 7.67f, 13.58f)
                lineTo(10.71f, 16.62f)
                curveTo(11f, 16.91f, 11f, 17.39f, 10.71f, 17.68f)
                curveTo(10.57f, 17.83f, 10.38f, 17.9f, 10.18f, 17.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(10.18f, 17.9f)
                curveTo(9.77f, 17.9f, 9.43f, 17.56f, 9.43f, 17.15f)
                verticalLineTo(6.85f)
                curveTo(9.43f, 6.44f, 9.77f, 6.1f, 10.18f, 6.1f)
                curveTo(10.59f, 6.1f, 10.93f, 6.44f, 10.93f, 6.85f)
                verticalLineTo(17.16f)
                curveTo(10.93f, 17.57f, 10.6f, 17.9f, 10.18f, 17.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.86f, 10.64f)
                curveTo(16.67f, 10.64f, 16.48f, 10.57f, 16.33f, 10.42f)
                lineTo(13.29f, 7.38f)
                curveTo(13f, 7.09f, 13f, 6.61f, 13.29f, 6.32f)
                curveTo(13.58f, 6.03f, 14.06f, 6.03f, 14.35f, 6.32f)
                lineTo(17.39f, 9.36f)
                curveTo(17.68f, 9.65f, 17.68f, 10.13f, 17.39f, 10.42f)
                curveTo(17.24f, 10.56f, 17.05f, 10.64f, 16.86f, 10.64f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(13.82f, 17.9f)
                curveTo(13.41f, 17.9f, 13.07f, 17.56f, 13.07f, 17.15f)
                verticalLineTo(6.85f)
                curveTo(13.07f, 6.44f, 13.41f, 6.1f, 13.82f, 6.1f)
                curveTo(14.23f, 6.1f, 14.57f, 6.44f, 14.57f, 6.85f)
                verticalLineTo(17.16f)
                curveTo(14.57f, 17.57f, 14.23f, 17.9f, 13.82f, 17.9f)
                close()
            }
        }.build()

        return _ArrangeSquare2!!
    }

@Suppress("ObjectPropertyName")
private var _ArrangeSquare2: ImageVector? = null
