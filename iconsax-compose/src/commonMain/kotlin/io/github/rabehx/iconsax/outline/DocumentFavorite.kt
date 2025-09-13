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

val Iconsax.Outline.DocumentFavorite: ImageVector
    get() {
        if (_DocumentFavorite != null) {
            return _DocumentFavorite!!
        }
        _DocumentFavorite = ImageVector.Builder(
            name = "Outline.DocumentFavorite",
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
                horizontalLineTo(14f)
                curveTo(14.41f, 1.25f, 14.75f, 1.59f, 14.75f, 2f)
                curveTo(14.75f, 2.41f, 14.41f, 2.75f, 14f, 2.75f)
                horizontalLineTo(9f)
                curveTo(4.39f, 2.75f, 2.75f, 4.39f, 2.75f, 9f)
                verticalLineTo(15f)
                curveTo(2.75f, 19.61f, 4.39f, 21.25f, 9f, 21.25f)
                horizontalLineTo(15f)
                curveTo(19.61f, 21.25f, 21.25f, 19.61f, 21.25f, 15f)
                verticalLineTo(10f)
                curveTo(21.25f, 9.59f, 21.59f, 9.25f, 22f, 9.25f)
                curveTo(22.41f, 9.25f, 22.75f, 9.59f, 22.75f, 10f)
                verticalLineTo(15f)
                curveTo(22.75f, 20.43f, 20.43f, 22.75f, 15f, 22.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(22f, 10.75f)
                horizontalLineTo(18f)
                curveTo(14.58f, 10.75f, 13.25f, 9.42f, 13.25f, 6f)
                verticalLineTo(2f)
                curveTo(13.25f, 1.7f, 13.43f, 1.42f, 13.71f, 1.31f)
                curveTo(13.99f, 1.19f, 14.31f, 1.26f, 14.53f, 1.47f)
                lineTo(22.53f, 9.47f)
                curveTo(22.74f, 9.68f, 22.81f, 10.01f, 22.69f, 10.29f)
                curveTo(22.57f, 10.57f, 22.3f, 10.75f, 22f, 10.75f)
                close()
                moveTo(14.75f, 3.81f)
                verticalLineTo(6f)
                curveTo(14.75f, 8.58f, 15.42f, 9.25f, 18f, 9.25f)
                horizontalLineTo(20.19f)
                lineTo(14.75f, 3.81f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(9.419f, 18.95f)
                curveTo(8.549f, 18.95f, 6.529f, 17.89f, 5.909f, 15.95f)
                curveTo(5.479f, 14.61f, 5.979f, 12.86f, 7.529f, 12.36f)
                curveTo(8.179f, 12.15f, 8.869f, 12.24f, 9.419f, 12.58f)
                curveTo(9.959f, 12.24f, 10.659f, 12.15f, 11.319f, 12.36f)
                curveTo(12.869f, 12.86f, 13.369f, 14.61f, 12.939f, 15.95f)
                curveTo(12.309f, 17.93f, 10.189f, 18.95f, 9.419f, 18.95f)
                close()
                moveTo(7.329f, 15.5f)
                curveTo(7.749f, 16.81f, 9.169f, 17.43f, 9.429f, 17.45f)
                curveTo(9.709f, 17.42f, 11.109f, 16.73f, 11.499f, 15.5f)
                curveTo(11.709f, 14.84f, 11.499f, 14f, 10.849f, 13.79f)
                curveTo(10.579f, 13.7f, 10.209f, 13.75f, 10.039f, 14.01f)
                curveTo(9.899f, 14.22f, 9.679f, 14.34f, 9.429f, 14.35f)
                curveTo(9.159f, 14.35f, 8.949f, 14.24f, 8.809f, 14.04f)
                curveTo(8.599f, 13.75f, 8.239f, 13.71f, 7.979f, 13.8f)
                curveTo(7.339f, 14f, 7.119f, 14.84f, 7.329f, 15.5f)
                close()
            }
        }.build()

        return _DocumentFavorite!!
    }

@Suppress("ObjectPropertyName")
private var _DocumentFavorite: ImageVector? = null
