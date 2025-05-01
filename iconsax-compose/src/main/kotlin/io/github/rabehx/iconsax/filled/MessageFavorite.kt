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


val Iconsax.Filled.MessageFavorite: ImageVector
    get() {
        if (_MessageFavorite != null) {
            return _MessageFavorite!!
        }
        _MessageFavorite = ImageVector.Builder(
            name = "Filled.MessageFavorite",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20.97f, 1f)
                horizontalLineTo(18.03f)
                curveTo(16.76f, 1f, 16f, 1.76f, 16f, 3.03f)
                verticalLineTo(5.97f)
                curveTo(16f, 7.24f, 16.76f, 8f, 18.03f, 8f)
                horizontalLineTo(20.97f)
                curveTo(22.24f, 8f, 23f, 7.24f, 23f, 5.97f)
                verticalLineTo(3.03f)
                curveTo(23f, 1.76f, 22.24f, 1f, 20.97f, 1f)
                close()
                moveTo(21.61f, 4.68f)
                curveTo(21.24f, 5.86f, 19.95f, 6.5f, 19.5f, 6.5f)
                curveTo(19.05f, 6.5f, 17.77f, 5.88f, 17.39f, 4.68f)
                curveTo(17.33f, 4.5f, 17.3f, 4.3f, 17.3f, 4.11f)
                curveTo(17.3f, 3.46f, 17.63f, 2.79f, 18.32f, 2.57f)
                curveTo(18.73f, 2.44f, 19.17f, 2.51f, 19.48f, 2.77f)
                curveTo(19.8f, 2.52f, 20.24f, 2.44f, 20.66f, 2.57f)
                curveTo(21.58f, 2.86f, 21.87f, 3.89f, 21.61f, 4.68f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18.03f, 9.5f)
                curveTo(16.08f, 9.5f, 14.5f, 7.92f, 14.5f, 5.97f)
                verticalLineTo(3f)
                curveTo(14.5f, 2.45f, 14.05f, 2f, 13.5f, 2f)
                horizontalLineTo(7f)
                curveTo(4.24f, 2f, 2f, 4.23f, 2f, 6.98f)
                verticalLineTo(13.95f)
                curveTo(2f, 16.71f, 4.24f, 18.95f, 7f, 18.95f)
                horizontalLineTo(8.5f)
                curveTo(8.78f, 18.95f, 9.14f, 19.13f, 9.3f, 19.35f)
                lineTo(10.8f, 21.34f)
                curveTo(11.46f, 22.22f, 12.54f, 22.22f, 13.2f, 21.34f)
                lineTo(14.7f, 19.35f)
                curveTo(14.89f, 19.1f, 15.19f, 18.95f, 15.5f, 18.95f)
                horizontalLineTo(17.01f)
                curveTo(19.77f, 18.95f, 22f, 16.72f, 22f, 13.96f)
                verticalLineTo(10.5f)
                curveTo(22f, 9.95f, 21.55f, 9.5f, 21f, 9.5f)
                horizontalLineTo(18.03f)
                close()
                moveTo(8f, 12f)
                curveTo(7.44f, 12f, 7f, 11.55f, 7f, 11f)
                curveTo(7f, 10.45f, 7.44f, 10f, 8f, 10f)
                curveTo(8.55f, 10f, 9f, 10.45f, 9f, 11f)
                curveTo(9f, 11.55f, 8.56f, 12f, 8f, 12f)
                close()
                moveTo(12f, 12f)
                curveTo(11.44f, 12f, 11f, 11.55f, 11f, 11f)
                curveTo(11f, 10.45f, 11.44f, 10f, 12f, 10f)
                curveTo(12.55f, 10f, 13f, 10.45f, 13f, 11f)
                curveTo(13f, 11.55f, 12.56f, 12f, 12f, 12f)
                close()
            }
        }.build()

        return _MessageFavorite!!
    }

@Suppress("ObjectPropertyName")
private var _MessageFavorite: ImageVector? = null
