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

val Iconsax.Outline.FolderConnection: ImageVector
    get() {
        if (_FolderConnection != null) {
            return _FolderConnection!!
        }
        _FolderConnection = ImageVector.Builder(
            name = "Outline.FolderConnection",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 19.75f)
                curveTo(11.59f, 19.75f, 11.25f, 19.41f, 11.25f, 19f)
                verticalLineTo(16f)
                curveTo(11.25f, 15.59f, 11.59f, 15.25f, 12f, 15.25f)
                curveTo(12.41f, 15.25f, 12.75f, 15.59f, 12.75f, 16f)
                verticalLineTo(19f)
                curveTo(12.75f, 19.41f, 12.41f, 19.75f, 12f, 19.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 23.75f)
                curveTo(10.48f, 23.75f, 9.25f, 22.52f, 9.25f, 21f)
                curveTo(9.25f, 19.48f, 10.48f, 18.25f, 12f, 18.25f)
                curveTo(13.52f, 18.25f, 14.75f, 19.48f, 14.75f, 21f)
                curveTo(14.75f, 22.52f, 13.52f, 23.75f, 12f, 23.75f)
                close()
                moveTo(12f, 19.75f)
                curveTo(11.31f, 19.75f, 10.75f, 20.31f, 10.75f, 21f)
                curveTo(10.75f, 21.69f, 11.31f, 22.25f, 12f, 22.25f)
                curveTo(12.69f, 22.25f, 13.25f, 21.69f, 13.25f, 21f)
                curveTo(13.25f, 20.31f, 12.69f, 19.75f, 12f, 19.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18f, 21.75f)
                horizontalLineTo(14f)
                curveTo(13.59f, 21.75f, 13.25f, 21.41f, 13.25f, 21f)
                curveTo(13.25f, 20.59f, 13.59f, 20.25f, 14f, 20.25f)
                horizontalLineTo(18f)
                curveTo(18.41f, 20.25f, 18.75f, 20.59f, 18.75f, 21f)
                curveTo(18.75f, 21.41f, 18.41f, 21.75f, 18f, 21.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(10f, 21.75f)
                horizontalLineTo(6f)
                curveTo(5.59f, 21.75f, 5.25f, 21.41f, 5.25f, 21f)
                curveTo(5.25f, 20.59f, 5.59f, 20.25f, 6f, 20.25f)
                horizontalLineTo(10f)
                curveTo(10.41f, 20.25f, 10.75f, 20.59f, 10.75f, 21f)
                curveTo(10.75f, 21.41f, 10.41f, 21.75f, 10f, 21.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15.5f, 16.75f)
                horizontalLineTo(8.5f)
                curveTo(5.28f, 16.75f, 4.25f, 15.72f, 4.25f, 12.5f)
                verticalLineTo(5.5f)
                curveTo(4.25f, 2.28f, 5.28f, 1.25f, 8.5f, 1.25f)
                horizontalLineTo(9.55f)
                curveTo(10.88f, 1.25f, 11.31f, 1.7f, 11.83f, 2.39f)
                lineTo(12.88f, 3.79f)
                curveTo(13.08f, 4.05f, 13.08f, 4.05f, 13.4f, 4.05f)
                horizontalLineTo(15.5f)
                curveTo(18.72f, 4.05f, 19.75f, 5.08f, 19.75f, 8.3f)
                verticalLineTo(12.5f)
                curveTo(19.75f, 15.72f, 18.72f, 16.75f, 15.5f, 16.75f)
                close()
                moveTo(8.5f, 2.75f)
                curveTo(6.11f, 2.75f, 5.75f, 3.11f, 5.75f, 5.5f)
                verticalLineTo(12.5f)
                curveTo(5.75f, 14.89f, 6.11f, 15.25f, 8.5f, 15.25f)
                horizontalLineTo(15.5f)
                curveTo(17.89f, 15.25f, 18.25f, 14.89f, 18.25f, 12.5f)
                verticalLineTo(8.3f)
                curveTo(18.25f, 5.91f, 17.89f, 5.55f, 15.5f, 5.55f)
                horizontalLineTo(13.4f)
                curveTo(12.41f, 5.55f, 12.05f, 5.18f, 11.69f, 4.7f)
                lineTo(10.63f, 3.29f)
                curveTo(10.28f, 2.82f, 10.23f, 2.75f, 9.55f, 2.75f)
                horizontalLineTo(8.5f)
                close()
            }
        }.build()

        return _FolderConnection!!
    }

@Suppress("ObjectPropertyName")
private var _FolderConnection: ImageVector? = null
