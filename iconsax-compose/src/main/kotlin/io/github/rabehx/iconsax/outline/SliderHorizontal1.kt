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

val Iconsax.Outline.SliderHorizontal1: ImageVector
    get() {
        if (_SliderHorizontal1 != null) {
            return _SliderHorizontal1!!
        }
        _SliderHorizontal1 = ImageVector.Builder(
            name = "Outline.SliderHorizontal1",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(13f, 22.75f)
                horizontalLineTo(11f)
                curveTo(7.7f, 22.75f, 5.71f, 22.09f, 5.34f, 18.74f)
                curveTo(5.28f, 18.29f, 5.25f, 17.75f, 5.25f, 17f)
                verticalLineTo(7f)
                curveTo(5.25f, 6.25f, 5.28f, 5.71f, 5.35f, 5.23f)
                curveTo(5.71f, 1.91f, 7.7f, 1.25f, 11f, 1.25f)
                horizontalLineTo(13f)
                curveTo(16.3f, 1.25f, 18.29f, 1.91f, 18.66f, 5.26f)
                curveTo(18.72f, 5.71f, 18.75f, 6.25f, 18.75f, 7f)
                verticalLineTo(17f)
                curveTo(18.75f, 17.75f, 18.72f, 18.29f, 18.65f, 18.77f)
                curveTo(18.29f, 22.09f, 16.3f, 22.75f, 13f, 22.75f)
                close()
                moveTo(11f, 2.75f)
                curveTo(7.69f, 2.75f, 7.06f, 3.42f, 6.84f, 5.42f)
                curveTo(6.78f, 5.85f, 6.75f, 6.32f, 6.75f, 7f)
                verticalLineTo(17f)
                curveTo(6.75f, 17.68f, 6.78f, 18.15f, 6.83f, 18.55f)
                curveTo(7.05f, 20.58f, 7.69f, 21.25f, 11f, 21.25f)
                horizontalLineTo(13f)
                curveTo(16.31f, 21.25f, 16.94f, 20.58f, 17.16f, 18.58f)
                curveTo(17.22f, 18.16f, 17.25f, 17.68f, 17.25f, 17f)
                verticalLineTo(7f)
                curveTo(17.25f, 6.33f, 17.22f, 5.85f, 17.17f, 5.45f)
                curveTo(16.95f, 3.42f, 16.31f, 2.75f, 13f, 2.75f)
                horizontalLineTo(11f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(5.67f, 19.42f)
                horizontalLineTo(5.33f)
                curveTo(2.24f, 19.42f, 1.25f, 18.43f, 1.25f, 15.33f)
                verticalLineTo(8.67f)
                curveTo(1.25f, 5.57f, 2.24f, 4.58f, 5.33f, 4.58f)
                horizontalLineTo(5.67f)
                curveTo(5.84f, 4.58f, 5.98f, 4.58f, 6.14f, 4.59f)
                curveTo(6.35f, 4.6f, 6.54f, 4.7f, 6.67f, 4.87f)
                curveTo(6.8f, 5.04f, 6.86f, 5.24f, 6.83f, 5.45f)
                curveTo(6.78f, 5.85f, 6.75f, 6.32f, 6.75f, 7f)
                verticalLineTo(17f)
                curveTo(6.75f, 17.68f, 6.78f, 18.15f, 6.83f, 18.55f)
                curveTo(6.86f, 18.76f, 6.8f, 18.97f, 6.67f, 19.13f)
                curveTo(6.54f, 19.29f, 6.35f, 19.39f, 6.14f, 19.41f)
                curveTo(5.98f, 19.42f, 5.84f, 19.42f, 5.67f, 19.42f)
                close()
                moveTo(5.27f, 6.08f)
                curveTo(3.08f, 6.09f, 2.75f, 6.44f, 2.75f, 8.67f)
                verticalLineTo(15.33f)
                curveTo(2.75f, 17.56f, 3.08f, 17.91f, 5.27f, 17.92f)
                curveTo(5.26f, 17.65f, 5.25f, 17.35f, 5.25f, 17f)
                verticalLineTo(7f)
                curveTo(5.25f, 6.65f, 5.26f, 6.35f, 5.27f, 6.08f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18.67f, 19.42f)
                horizontalLineTo(18.33f)
                curveTo(18.16f, 19.42f, 18.02f, 19.42f, 17.86f, 19.41f)
                curveTo(17.65f, 19.4f, 17.46f, 19.3f, 17.33f, 19.13f)
                curveTo(17.2f, 18.97f, 17.14f, 18.76f, 17.17f, 18.55f)
                curveTo(17.23f, 18.15f, 17.25f, 17.67f, 17.25f, 17f)
                verticalLineTo(7f)
                curveTo(17.25f, 6.33f, 17.22f, 5.85f, 17.17f, 5.45f)
                curveTo(17.14f, 5.24f, 17.2f, 5.03f, 17.33f, 4.87f)
                curveTo(17.46f, 4.71f, 17.65f, 4.61f, 17.86f, 4.59f)
                curveTo(18.02f, 4.58f, 18.16f, 4.58f, 18.33f, 4.58f)
                horizontalLineTo(18.67f)
                curveTo(21.76f, 4.58f, 22.75f, 5.57f, 22.75f, 8.67f)
                verticalLineTo(15.33f)
                curveTo(22.75f, 18.43f, 21.76f, 19.42f, 18.67f, 19.42f)
                close()
                moveTo(18.73f, 6.08f)
                curveTo(18.74f, 6.35f, 18.75f, 6.65f, 18.75f, 7f)
                verticalLineTo(17f)
                curveTo(18.75f, 17.35f, 18.74f, 17.65f, 18.73f, 17.92f)
                curveTo(20.92f, 17.91f, 21.25f, 17.56f, 21.25f, 15.33f)
                verticalLineTo(8.67f)
                curveTo(21.25f, 6.44f, 20.92f, 6.09f, 18.73f, 6.08f)
                close()
            }
        }.build()

        return _SliderHorizontal1!!
    }

@Suppress("ObjectPropertyName")
private var _SliderHorizontal1: ImageVector? = null
