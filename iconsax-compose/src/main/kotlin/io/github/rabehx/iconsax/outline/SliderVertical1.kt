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

val Iconsax.Outline.SliderVertical1: ImageVector
    get() {
        if (_SliderVertical1 != null) {
            return _SliderVertical1!!
        }
        _SliderVertical1 = ImageVector.Builder(
            name = "Outline.SliderVertical1",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17f, 18.75f)
                horizontalLineTo(7f)
                curveTo(6.25f, 18.75f, 5.7f, 18.72f, 5.23f, 18.65f)
                curveTo(1.91f, 18.29f, 1.25f, 16.3f, 1.25f, 13f)
                verticalLineTo(11f)
                curveTo(1.25f, 7.7f, 1.91f, 5.71f, 5.26f, 5.34f)
                curveTo(5.7f, 5.28f, 6.25f, 5.25f, 7f, 5.25f)
                horizontalLineTo(17f)
                curveTo(17.75f, 5.25f, 18.3f, 5.28f, 18.77f, 5.35f)
                curveTo(22.1f, 5.72f, 22.75f, 7.7f, 22.75f, 11f)
                verticalLineTo(13f)
                curveTo(22.75f, 16.3f, 22.09f, 18.29f, 18.74f, 18.66f)
                curveTo(18.3f, 18.72f, 17.75f, 18.75f, 17f, 18.75f)
                close()
                moveTo(7f, 6.75f)
                curveTo(6.32f, 6.75f, 5.84f, 6.78f, 5.45f, 6.83f)
                curveTo(3.42f, 7.06f, 2.75f, 7.69f, 2.75f, 11f)
                verticalLineTo(13f)
                curveTo(2.75f, 16.31f, 3.42f, 16.94f, 5.42f, 17.17f)
                curveTo(5.84f, 17.23f, 6.32f, 17.25f, 7f, 17.25f)
                horizontalLineTo(17f)
                curveTo(17.68f, 17.25f, 18.16f, 17.22f, 18.55f, 17.17f)
                curveTo(20.58f, 16.95f, 21.25f, 16.31f, 21.25f, 13f)
                verticalLineTo(11f)
                curveTo(21.25f, 7.69f, 20.58f, 7.06f, 18.58f, 6.83f)
                curveTo(18.16f, 6.77f, 17.68f, 6.75f, 17f, 6.75f)
                horizontalLineTo(7f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15.33f, 22.75f)
                horizontalLineTo(8.67f)
                curveTo(5.57f, 22.75f, 4.58f, 21.76f, 4.58f, 18.67f)
                verticalLineTo(18.33f)
                curveTo(4.58f, 18.16f, 4.58f, 18.01f, 4.59f, 17.86f)
                curveTo(4.6f, 17.65f, 4.7f, 17.46f, 4.87f, 17.33f)
                curveTo(5.03f, 17.2f, 5.24f, 17.14f, 5.45f, 17.17f)
                curveTo(5.85f, 17.23f, 6.33f, 17.25f, 7f, 17.25f)
                horizontalLineTo(17f)
                curveTo(17.68f, 17.25f, 18.16f, 17.22f, 18.55f, 17.17f)
                curveTo(18.76f, 17.14f, 18.97f, 17.2f, 19.13f, 17.33f)
                curveTo(19.29f, 17.46f, 19.39f, 17.65f, 19.41f, 17.86f)
                curveTo(19.42f, 18.02f, 19.42f, 18.16f, 19.42f, 18.33f)
                verticalLineTo(18.67f)
                curveTo(19.42f, 21.76f, 18.43f, 22.75f, 15.33f, 22.75f)
                close()
                moveTo(6.08f, 18.73f)
                curveTo(6.09f, 20.92f, 6.44f, 21.25f, 8.67f, 21.25f)
                horizontalLineTo(15.33f)
                curveTo(17.56f, 21.25f, 17.91f, 20.92f, 17.92f, 18.73f)
                curveTo(17.65f, 18.74f, 17.35f, 18.75f, 17f, 18.75f)
                horizontalLineTo(7f)
                curveTo(6.65f, 18.75f, 6.35f, 18.74f, 6.08f, 18.73f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18.66f, 6.84f)
                curveTo(18.62f, 6.84f, 18.59f, 6.84f, 18.55f, 6.83f)
                curveTo(18.15f, 6.77f, 17.67f, 6.75f, 17f, 6.75f)
                horizontalLineTo(7f)
                curveTo(6.32f, 6.75f, 5.84f, 6.78f, 5.45f, 6.83f)
                curveTo(5.24f, 6.86f, 5.03f, 6.8f, 4.87f, 6.67f)
                curveTo(4.71f, 6.54f, 4.61f, 6.35f, 4.59f, 6.14f)
                curveTo(4.58f, 5.98f, 4.58f, 5.84f, 4.58f, 5.67f)
                verticalLineTo(5.33f)
                curveTo(4.58f, 2.24f, 5.57f, 1.25f, 8.67f, 1.25f)
                horizontalLineTo(15.33f)
                curveTo(18.43f, 1.25f, 19.42f, 2.24f, 19.42f, 5.33f)
                verticalLineTo(5.67f)
                curveTo(19.42f, 5.84f, 19.42f, 5.99f, 19.41f, 6.14f)
                curveTo(19.4f, 6.35f, 19.3f, 6.54f, 19.13f, 6.67f)
                curveTo(19f, 6.78f, 18.83f, 6.84f, 18.66f, 6.84f)
                close()
                moveTo(7f, 5.25f)
                horizontalLineTo(17f)
                curveTo(17.35f, 5.25f, 17.65f, 5.26f, 17.92f, 5.27f)
                curveTo(17.91f, 3.08f, 17.56f, 2.75f, 15.33f, 2.75f)
                horizontalLineTo(8.67f)
                curveTo(6.44f, 2.75f, 6.09f, 3.08f, 6.08f, 5.27f)
                curveTo(6.35f, 5.26f, 6.65f, 5.25f, 7f, 5.25f)
                close()
            }
        }.build()

        return _SliderVertical1!!
    }

@Suppress("ObjectPropertyName")
private var _SliderVertical1: ImageVector? = null
