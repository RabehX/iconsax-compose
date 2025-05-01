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


val Iconsax.Filled.DocumentFilter: ImageVector
    get() {
        if (_DocumentFilter != null) {
            return _DocumentFilter!!
        }
        _DocumentFilter = ImageVector.Builder(
            name = "Filled.DocumentFilter",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(3.23f, 1f)
                horizontalLineTo(11.36f)
                curveTo(12.04f, 1f, 12.59f, 1.56f, 12.59f, 2.25f)
                verticalLineTo(3.62f)
                curveTo(12.59f, 4.12f, 12.28f, 4.74f, 11.97f, 5.05f)
                lineTo(9.33f, 7.43f)
                curveTo(8.96f, 7.74f, 8.72f, 8.36f, 8.72f, 8.86f)
                verticalLineTo(11.54f)
                curveTo(8.72f, 11.91f, 8.47f, 12.41f, 8.17f, 12.6f)
                lineTo(7.3f, 13.17f)
                curveTo(6.5f, 13.67f, 5.39f, 13.11f, 5.39f, 12.11f)
                verticalLineTo(8.8f)
                curveTo(5.39f, 8.36f, 5.14f, 7.8f, 4.9f, 7.49f)
                lineTo(2.56f, 4.99f)
                curveTo(2.25f, 4.68f, 2f, 4.12f, 2f, 3.75f)
                verticalLineTo(2.31f)
                curveTo(2f, 1.56f, 2.55f, 1f, 3.23f, 1f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17f, 2f)
                horizontalLineTo(14.6f)
                curveTo(14.32f, 2f, 14.1f, 2.22f, 14.1f, 2.5f)
                curveTo(14.1f, 2.98f, 14.1f, 3.62f, 14.1f, 3.62f)
                curveTo(14.1f, 4.61f, 13.57f, 5.58f, 13.05f, 6.11f)
                lineTo(10.33f, 8.54f)
                curveTo(10.3f, 8.61f, 10.25f, 8.71f, 10.22f, 8.79f)
                verticalLineTo(11.54f)
                curveTo(10.22f, 12.45f, 9.68f, 13.44f, 8.94f, 13.89f)
                lineTo(8.12f, 14.42f)
                curveTo(7.66f, 14.71f, 7.15f, 14.85f, 6.64f, 14.85f)
                curveTo(6.18f, 14.85f, 5.72f, 14.73f, 5.3f, 14.5f)
                curveTo(4.783f, 14.213f, 4.392f, 13.781f, 4.153f, 13.274f)
                curveTo(4.031f, 13.014f, 4f, 12.724f, 4f, 12.438f)
                verticalLineTo(10.21f)
                curveTo(4f, 10.08f, 3.95f, 9.95f, 3.85f, 9.86f)
                lineTo(2.85f, 8.86f)
                curveTo(2.54f, 8.54f, 2f, 8.76f, 2f, 9.21f)
                verticalLineTo(17f)
                curveTo(2f, 19.76f, 4.24f, 22f, 7f, 22f)
                horizontalLineTo(17f)
                curveTo(19.76f, 22f, 22f, 19.76f, 22f, 17f)
                verticalLineTo(7f)
                curveTo(22f, 4.24f, 19.76f, 2f, 17f, 2f)
                close()
                moveTo(18f, 17.75f)
                horizontalLineTo(11f)
                curveTo(10.59f, 17.75f, 10.25f, 17.41f, 10.25f, 17f)
                curveTo(10.25f, 16.59f, 10.59f, 16.25f, 11f, 16.25f)
                horizontalLineTo(18f)
                curveTo(18.41f, 16.25f, 18.75f, 16.59f, 18.75f, 17f)
                curveTo(18.75f, 17.41f, 18.41f, 17.75f, 18f, 17.75f)
                close()
                moveTo(18f, 13.75f)
                horizontalLineTo(13f)
                curveTo(12.59f, 13.75f, 12.25f, 13.41f, 12.25f, 13f)
                curveTo(12.25f, 12.59f, 12.59f, 12.25f, 13f, 12.25f)
                horizontalLineTo(18f)
                curveTo(18.41f, 12.25f, 18.75f, 12.59f, 18.75f, 13f)
                curveTo(18.75f, 13.41f, 18.41f, 13.75f, 18f, 13.75f)
                close()
            }
        }.build()

        return _DocumentFilter!!
    }

@Suppress("ObjectPropertyName")
private var _DocumentFilter: ImageVector? = null
