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

val Iconsax.Outline.FolderFavorite: ImageVector
    get() {
        if (_FolderFavorite != null) {
            return _FolderFavorite!!
        }
        _FolderFavorite = ImageVector.Builder(
            name = "Outline.FolderFavorite",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 17.88f)
                curveTo(11.75f, 17.88f, 11.49f, 17.79f, 11.29f, 17.61f)
                lineTo(8.71f, 15.35f)
                curveTo(7.74f, 14.5f, 7.61f, 13.04f, 8.42f, 12.03f)
                curveTo(9.24f, 11.01f, 10.7f, 10.82f, 11.75f, 11.61f)
                lineTo(12f, 11.8f)
                lineTo(12.26f, 11.6f)
                curveTo(13.31f, 10.81f, 14.77f, 11f, 15.59f, 12.02f)
                curveTo(16.4f, 13.03f, 16.27f, 14.49f, 15.3f, 15.34f)
                lineTo(12.72f, 17.6f)
                curveTo(12.51f, 17.79f, 12.25f, 17.88f, 12f, 17.88f)
                close()
                moveTo(9.69f, 14.22f)
                lineTo(12f, 16.24f)
                lineTo(14.31f, 14.22f)
                curveTo(14.68f, 13.9f, 14.73f, 13.35f, 14.42f, 12.97f)
                curveTo(14.11f, 12.58f, 13.56f, 12.51f, 13.16f, 12.81f)
                lineTo(12.45f, 13.34f)
                curveTo(12.18f, 13.54f, 11.82f, 13.54f, 11.55f, 13.34f)
                lineTo(10.84f, 12.81f)
                curveTo(10.45f, 12.51f, 9.89f, 12.58f, 9.58f, 12.97f)
                curveTo(9.28f, 13.35f, 9.33f, 13.9f, 9.69f, 14.22f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17f, 22.75f)
                horizontalLineTo(7f)
                curveTo(2.59f, 22.75f, 1.25f, 21.41f, 1.25f, 17f)
                verticalLineTo(7f)
                curveTo(1.25f, 2.59f, 2.59f, 1.25f, 7f, 1.25f)
                horizontalLineTo(8.5f)
                curveTo(10.25f, 1.25f, 10.8f, 1.82f, 11.5f, 2.75f)
                lineTo(13f, 4.75f)
                curveTo(13.33f, 5.19f, 13.38f, 5.25f, 14f, 5.25f)
                horizontalLineTo(17f)
                curveTo(21.41f, 5.25f, 22.75f, 6.59f, 22.75f, 11f)
                verticalLineTo(17f)
                curveTo(22.75f, 21.41f, 21.41f, 22.75f, 17f, 22.75f)
                close()
                moveTo(7f, 2.75f)
                curveTo(3.42f, 2.75f, 2.75f, 3.43f, 2.75f, 7f)
                verticalLineTo(17f)
                curveTo(2.75f, 20.57f, 3.42f, 21.25f, 7f, 21.25f)
                horizontalLineTo(17f)
                curveTo(20.58f, 21.25f, 21.25f, 20.57f, 21.25f, 17f)
                verticalLineTo(11f)
                curveTo(21.25f, 7.43f, 20.58f, 6.75f, 17f, 6.75f)
                horizontalLineTo(14f)
                curveTo(12.72f, 6.75f, 12.3f, 6.31f, 11.8f, 5.65f)
                lineTo(10.3f, 3.65f)
                curveTo(9.78f, 2.96f, 9.62f, 2.75f, 8.5f, 2.75f)
                horizontalLineTo(7f)
                close()
            }
        }.build()

        return _FolderFavorite!!
    }

@Suppress("ObjectPropertyName")
private var _FolderFavorite: ImageVector? = null
