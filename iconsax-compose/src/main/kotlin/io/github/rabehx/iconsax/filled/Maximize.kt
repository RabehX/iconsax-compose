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


val Iconsax.Filled.Maximize: ImageVector
    get() {
        if (_Maximize != null) {
            return _Maximize!!
        }
        _Maximize = ImageVector.Builder(
            name = "Filled.Maximize",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20.95f, 4.13f)
                curveTo(20.66f, 3.71f, 20.29f, 3.34f, 19.87f, 3.05f)
                curveTo(18.92f, 2.36f, 17.68f, 2f, 16.19f, 2f)
                horizontalLineTo(7.81f)
                curveTo(7.61f, 2f, 7.41f, 2.01f, 7.22f, 2.03f)
                curveTo(3.94f, 2.24f, 2f, 4.37f, 2f, 7.81f)
                verticalLineTo(16.19f)
                curveTo(2f, 17.68f, 2.36f, 18.92f, 3.05f, 19.87f)
                curveTo(3.34f, 20.29f, 3.71f, 20.66f, 4.13f, 20.95f)
                curveTo(4.95f, 21.55f, 5.99f, 21.9f, 7.22f, 21.98f)
                curveTo(7.41f, 21.99f, 7.61f, 22f, 7.81f, 22f)
                horizontalLineTo(16.19f)
                curveTo(19.83f, 22f, 22f, 19.83f, 22f, 16.19f)
                verticalLineTo(7.81f)
                curveTo(22f, 6.32f, 21.64f, 5.08f, 20.95f, 4.13f)
                close()
                moveTo(18.75f, 10f)
                curveTo(18.75f, 10.41f, 18.41f, 10.75f, 18f, 10.75f)
                curveTo(17.59f, 10.75f, 17.25f, 10.41f, 17.25f, 10f)
                verticalLineTo(7.81f)
                lineTo(13.06f, 12f)
                lineTo(17.25f, 16.19f)
                verticalLineTo(14f)
                curveTo(17.25f, 13.59f, 17.59f, 13.25f, 18f, 13.25f)
                curveTo(18.41f, 13.25f, 18.75f, 13.59f, 18.75f, 14f)
                verticalLineTo(18f)
                curveTo(18.75f, 18.1f, 18.73f, 18.19f, 18.69f, 18.29f)
                curveTo(18.61f, 18.47f, 18.47f, 18.62f, 18.28f, 18.7f)
                curveTo(18.19f, 18.74f, 18.09f, 18.76f, 17.99f, 18.76f)
                horizontalLineTo(13.99f)
                curveTo(13.58f, 18.76f, 13.24f, 18.42f, 13.24f, 18.01f)
                curveTo(13.24f, 17.6f, 13.58f, 17.26f, 13.99f, 17.26f)
                horizontalLineTo(16.18f)
                lineTo(12f, 13.06f)
                lineTo(7.81f, 17.25f)
                horizontalLineTo(10f)
                curveTo(10.41f, 17.25f, 10.75f, 17.59f, 10.75f, 18f)
                curveTo(10.75f, 18.41f, 10.41f, 18.75f, 10f, 18.75f)
                horizontalLineTo(6f)
                curveTo(5.9f, 18.75f, 5.8f, 18.73f, 5.71f, 18.69f)
                curveTo(5.53f, 18.61f, 5.38f, 18.47f, 5.3f, 18.28f)
                curveTo(5.27f, 18.19f, 5.25f, 18.1f, 5.25f, 18f)
                verticalLineTo(14f)
                curveTo(5.25f, 13.59f, 5.59f, 13.25f, 6f, 13.25f)
                curveTo(6.41f, 13.25f, 6.75f, 13.59f, 6.75f, 14f)
                verticalLineTo(16.19f)
                lineTo(10.94f, 12f)
                lineTo(6.75f, 7.81f)
                verticalLineTo(10f)
                curveTo(6.75f, 10.41f, 6.41f, 10.75f, 6f, 10.75f)
                curveTo(5.59f, 10.75f, 5.25f, 10.41f, 5.25f, 10f)
                verticalLineTo(6f)
                curveTo(5.25f, 5.9f, 5.27f, 5.81f, 5.31f, 5.71f)
                curveTo(5.39f, 5.53f, 5.53f, 5.38f, 5.72f, 5.3f)
                curveTo(5.81f, 5.27f, 5.9f, 5.25f, 6f, 5.25f)
                horizontalLineTo(10f)
                curveTo(10.41f, 5.25f, 10.75f, 5.59f, 10.75f, 6f)
                curveTo(10.75f, 6.41f, 10.41f, 6.75f, 10f, 6.75f)
                horizontalLineTo(7.81f)
                lineTo(12f, 10.94f)
                lineTo(16.19f, 6.75f)
                horizontalLineTo(14f)
                curveTo(13.59f, 6.75f, 13.25f, 6.41f, 13.25f, 6f)
                curveTo(13.25f, 5.59f, 13.59f, 5.25f, 14f, 5.25f)
                horizontalLineTo(18f)
                curveTo(18.1f, 5.25f, 18.19f, 5.27f, 18.29f, 5.31f)
                curveTo(18.47f, 5.39f, 18.62f, 5.53f, 18.7f, 5.72f)
                curveTo(18.73f, 5.81f, 18.75f, 5.9f, 18.75f, 6f)
                verticalLineTo(10f)
                close()
            }
        }.build()

        return _Maximize!!
    }

@Suppress("ObjectPropertyName")
private var _Maximize: ImageVector? = null
