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

val Iconsax.Outline.RefreshLeftSquare: ImageVector
    get() {
        if (_RefreshLeftSquare != null) {
            return _RefreshLeftSquare!!
        }
        _RefreshLeftSquare = ImageVector.Builder(
            name = "Outline.RefreshLeftSquare",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 18.01f)
                curveTo(8.83f, 18.01f, 6.25f, 15.43f, 6.25f, 12.26f)
                curveTo(6.25f, 11.12f, 6.58f, 10.01f, 7.22f, 9.07f)
                curveTo(7.45f, 8.73f, 7.92f, 8.63f, 8.26f, 8.86f)
                curveTo(8.6f, 9.09f, 8.7f, 9.56f, 8.47f, 9.9f)
                curveTo(8f, 10.6f, 7.76f, 11.42f, 7.76f, 12.26f)
                curveTo(7.76f, 14.6f, 9.67f, 16.51f, 12.01f, 16.51f)
                curveTo(14.35f, 16.51f, 16.26f, 14.6f, 16.26f, 12.26f)
                curveTo(16.26f, 9.92f, 14.35f, 8.01f, 12.01f, 8.01f)
                curveTo(11.51f, 8.01f, 11.03f, 8.08f, 10.56f, 8.22f)
                curveTo(10.17f, 8.34f, 9.75f, 8.12f, 9.62f, 7.72f)
                curveTo(9.5f, 7.32f, 9.72f, 6.9f, 10.12f, 6.78f)
                curveTo(10.73f, 6.59f, 11.36f, 6.5f, 12.01f, 6.5f)
                curveTo(15.18f, 6.5f, 17.76f, 9.08f, 17.76f, 12.25f)
                curveTo(17.76f, 15.42f, 15.17f, 18.01f, 12f, 18.01f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(9.619f, 8.4f)
                curveTo(9.449f, 8.4f, 9.269f, 8.34f, 9.129f, 8.22f)
                curveTo(8.819f, 7.95f, 8.789f, 7.47f, 9.059f, 7.16f)
                lineTo(10.729f, 5.25f)
                curveTo(10.999f, 4.94f, 11.479f, 4.9f, 11.789f, 5.18f)
                curveTo(12.099f, 5.45f, 12.129f, 5.93f, 11.859f, 6.24f)
                lineTo(10.189f, 8.15f)
                curveTo(10.029f, 8.31f, 9.829f, 8.4f, 9.619f, 8.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(11.56f, 9.82f)
                curveTo(11.41f, 9.82f, 11.25f, 9.77f, 11.12f, 9.68f)
                lineTo(9.18f, 8.26f)
                curveTo(8.85f, 8.02f, 8.77f, 7.55f, 9.02f, 7.21f)
                curveTo(9.26f, 6.88f, 9.73f, 6.8f, 10.07f, 7.05f)
                lineTo(12.01f, 8.47f)
                curveTo(12.34f, 8.71f, 12.42f, 9.18f, 12.17f, 9.52f)
                curveTo(12.02f, 9.71f, 11.79f, 9.82f, 11.56f, 9.82f)
                close()
            }
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
        }.build()

        return _RefreshLeftSquare!!
    }

@Suppress("ObjectPropertyName")
private var _RefreshLeftSquare: ImageVector? = null
