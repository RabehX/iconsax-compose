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


val Iconsax.Filled.Ranking: ImageVector
    get() {
        if (_Ranking != null) {
            return _Ranking!!
        }
        _Ranking = ImageVector.Builder(
            name = "Filled.Ranking",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(13.3f, 8.11f)
                lineTo(14.62f, 10.75f)
                curveTo(14.8f, 11.11f, 15.28f, 11.47f, 15.68f, 11.53f)
                lineTo(18.07f, 11.93f)
                curveTo(19.6f, 12.19f, 19.96f, 13.29f, 18.86f, 14.39f)
                lineTo(17f, 16.26f)
                curveTo(16.69f, 16.57f, 16.51f, 17.18f, 16.61f, 17.62f)
                lineTo(17.14f, 19.93f)
                curveTo(17.56f, 21.75f, 16.59f, 22.46f, 14.98f, 21.51f)
                lineTo(12.74f, 20.18f)
                curveTo(12.33f, 19.94f, 11.67f, 19.94f, 11.26f, 20.18f)
                lineTo(9.01f, 21.5f)
                curveTo(7.4f, 22.45f, 6.43f, 21.74f, 6.85f, 19.92f)
                lineTo(7.38f, 17.61f)
                curveTo(7.48f, 17.18f, 7.3f, 16.57f, 6.99f, 16.25f)
                lineTo(5.14f, 14.4f)
                curveTo(4.04f, 13.3f, 4.4f, 12.19f, 5.93f, 11.94f)
                lineTo(8.32f, 11.54f)
                curveTo(8.72f, 11.47f, 9.2f, 11.12f, 9.38f, 10.76f)
                lineTo(10.7f, 8.12f)
                curveTo(11.41f, 6.68f, 12.59f, 6.68f, 13.3f, 8.11f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(6f, 9.75f)
                curveTo(5.59f, 9.75f, 5.25f, 9.41f, 5.25f, 9f)
                verticalLineTo(2f)
                curveTo(5.25f, 1.59f, 5.59f, 1.25f, 6f, 1.25f)
                curveTo(6.41f, 1.25f, 6.75f, 1.59f, 6.75f, 2f)
                verticalLineTo(9f)
                curveTo(6.75f, 9.41f, 6.41f, 9.75f, 6f, 9.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18f, 9.75f)
                curveTo(17.59f, 9.75f, 17.25f, 9.41f, 17.25f, 9f)
                verticalLineTo(2f)
                curveTo(17.25f, 1.59f, 17.59f, 1.25f, 18f, 1.25f)
                curveTo(18.41f, 1.25f, 18.75f, 1.59f, 18.75f, 2f)
                verticalLineTo(9f)
                curveTo(18.75f, 9.41f, 18.41f, 9.75f, 18f, 9.75f)
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

        return _Ranking!!
    }

@Suppress("ObjectPropertyName")
private var _Ranking: ImageVector? = null
