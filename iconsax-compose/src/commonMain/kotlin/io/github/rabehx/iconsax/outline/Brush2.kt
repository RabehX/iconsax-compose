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

val Iconsax.Outline.Brush2: ImageVector
    get() {
        if (_Brush2 != null) {
            return _Brush2!!
        }
        _Brush2 = ImageVector.Builder(
            name = "Outline.Brush2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 22.75f)
                curveTo(10.21f, 22.75f, 8.75f, 21.29f, 8.75f, 19.5f)
                verticalLineTo(18.75f)
                horizontalLineTo(4.5f)
                curveTo(3.76f, 18.75f, 3.07f, 18.46f, 2.55f, 17.93f)
                curveTo(2.04f, 17.43f, 1.75f, 16.74f, 1.75f, 16f)
                curveTo(1.75f, 14.6f, 2.84f, 13.4f, 4.24f, 13.26f)
                curveTo(4.29f, 13.25f, 4.39f, 13.25f, 4.5f, 13.25f)
                horizontalLineTo(19.5f)
                curveTo(19.61f, 13.25f, 19.71f, 13.25f, 19.81f, 13.27f)
                curveTo(20.4f, 13.32f, 20.99f, 13.6f, 21.45f, 14.07f)
                curveTo(22.02f, 14.62f, 22.31f, 15.42f, 22.24f, 16.24f)
                curveTo(22.12f, 17.65f, 20.87f, 18.75f, 19.39f, 18.75f)
                horizontalLineTo(15.25f)
                verticalLineTo(19.5f)
                curveTo(15.25f, 21.29f, 13.79f, 22.75f, 12f, 22.75f)
                close()
                moveTo(4.5f, 14.75f)
                curveTo(4.48f, 14.75f, 4.4f, 14.75f, 4.38f, 14.76f)
                curveTo(3.75f, 14.82f, 3.25f, 15.37f, 3.25f, 16f)
                curveTo(3.25f, 16.33f, 3.38f, 16.64f, 3.61f, 16.87f)
                curveTo(3.85f, 17.12f, 4.16f, 17.25f, 4.5f, 17.25f)
                horizontalLineTo(9.5f)
                curveTo(9.91f, 17.25f, 10.25f, 17.59f, 10.25f, 18f)
                verticalLineTo(19.5f)
                curveTo(10.25f, 20.46f, 11.04f, 21.25f, 12f, 21.25f)
                curveTo(12.96f, 21.25f, 13.75f, 20.46f, 13.75f, 19.5f)
                verticalLineTo(18f)
                curveTo(13.75f, 17.59f, 14.09f, 17.25f, 14.5f, 17.25f)
                horizontalLineTo(19.39f)
                curveTo(20.08f, 17.25f, 20.69f, 16.74f, 20.75f, 16.11f)
                curveTo(20.78f, 15.73f, 20.65f, 15.38f, 20.39f, 15.12f)
                curveTo(20.17f, 14.9f, 19.91f, 14.77f, 19.63f, 14.75f)
                lineTo(19.5f, 14.74f)
                horizontalLineTo(4.5f)
                verticalLineTo(14.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19.69f, 14.76f)
                curveTo(19.65f, 14.76f, 19.61f, 14.76f, 19.57f, 14.75f)
                horizontalLineTo(4.5f)
                curveTo(4.29f, 14.79f, 4.04f, 14.73f, 3.88f, 14.59f)
                curveTo(3.71f, 14.46f, 3.58f, 14.26f, 3.57f, 14.05f)
                lineTo(3.08f, 5.34f)
                curveTo(2.98f, 4.32f, 3.32f, 3.27f, 4.03f, 2.48f)
                curveTo(4.74f, 1.7f, 5.75f, 1.25f, 6.81f, 1.25f)
                horizontalLineTo(17.19f)
                curveTo(18.25f, 1.25f, 19.26f, 1.7f, 19.97f, 2.49f)
                curveTo(20.67f, 3.27f, 21.02f, 4.32f, 20.92f, 5.36f)
                lineTo(20.44f, 14.05f)
                curveTo(20.43f, 14.26f, 20.33f, 14.46f, 20.16f, 14.59f)
                curveTo(20.03f, 14.7f, 19.86f, 14.76f, 19.69f, 14.76f)
                close()
                moveTo(5.02f, 13.25f)
                horizontalLineTo(18.98f)
                lineTo(19.42f, 5.26f)
                curveTo(19.42f, 5.25f, 19.42f, 5.24f, 19.42f, 5.22f)
                curveTo(19.48f, 4.58f, 19.28f, 3.96f, 18.85f, 3.49f)
                curveTo(18.42f, 3.02f, 17.82f, 2.75f, 17.18f, 2.75f)
                horizontalLineTo(6.81f)
                curveTo(6.18f, 2.75f, 5.57f, 3.02f, 5.14f, 3.49f)
                curveTo(4.71f, 3.97f, 4.51f, 4.58f, 4.58f, 5.22f)
                lineTo(5.02f, 13.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(7.99f, 7.75f)
                curveTo(7.58f, 7.75f, 7.24f, 7.41f, 7.24f, 7f)
                verticalLineTo(2f)
                curveTo(7.24f, 1.59f, 7.58f, 1.25f, 7.99f, 1.25f)
                curveTo(8.4f, 1.25f, 8.74f, 1.59f, 8.74f, 2f)
                verticalLineTo(7f)
                curveTo(8.74f, 7.41f, 8.4f, 7.75f, 7.99f, 7.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 4.75f)
                curveTo(11.59f, 4.75f, 11.25f, 4.41f, 11.25f, 4f)
                verticalLineTo(2f)
                curveTo(11.25f, 1.59f, 11.59f, 1.25f, 12f, 1.25f)
                curveTo(12.41f, 1.25f, 12.75f, 1.59f, 12.75f, 2f)
                verticalLineTo(4f)
                curveTo(12.75f, 4.41f, 12.41f, 4.75f, 12f, 4.75f)
                close()
            }
        }.build()

        return _Brush2!!
    }

@Suppress("ObjectPropertyName")
private var _Brush2: ImageVector? = null
