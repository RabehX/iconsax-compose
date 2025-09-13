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

val Iconsax.Outline.FolderCloud: ImageVector
    get() {
        if (_FolderCloud != null) {
            return _FolderCloud!!
        }
        _FolderCloud = ImageVector.Builder(
            name = "Outline.FolderCloud",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(9f, 22.75f)
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
                verticalLineTo(13f)
                curveTo(22.75f, 13.41f, 22.41f, 13.75f, 22f, 13.75f)
                curveTo(21.59f, 13.75f, 21.25f, 13.41f, 21.25f, 13f)
                verticalLineTo(11f)
                curveTo(21.25f, 7.43f, 20.58f, 6.75f, 17f, 6.75f)
                horizontalLineTo(14f)
                curveTo(12.72f, 6.75f, 12.3f, 6.31f, 11.8f, 5.65f)
                lineTo(10.3f, 3.65f)
                curveTo(9.78f, 2.96f, 9.62f, 2.75f, 8.5f, 2.75f)
                horizontalLineTo(7f)
                curveTo(3.42f, 2.75f, 2.75f, 3.43f, 2.75f, 7f)
                verticalLineTo(17f)
                curveTo(2.75f, 20.57f, 3.42f, 21.25f, 7f, 21.25f)
                horizontalLineTo(9f)
                curveTo(9.41f, 21.25f, 9.75f, 21.59f, 9.75f, 22f)
                curveTo(9.75f, 22.41f, 9.41f, 22.75f, 9f, 22.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19.34f, 22.81f)
                curveTo(19.33f, 22.81f, 19.32f, 22.81f, 19.31f, 22.81f)
                horizontalLineTo(13.75f)
                curveTo(12.08f, 22.69f, 11.24f, 21.41f, 11.24f, 20.19f)
                curveTo(11.24f, 19.21f, 11.79f, 18.18f, 12.85f, 17.76f)
                curveTo(12.63f, 16.51f, 12.95f, 15.35f, 13.78f, 14.48f)
                curveTo(14.8f, 13.41f, 16.44f, 12.98f, 17.86f, 13.41f)
                curveTo(19.1f, 13.79f, 19.99f, 14.77f, 20.36f, 16.13f)
                curveTo(21.41f, 16.45f, 22.24f, 17.28f, 22.58f, 18.41f)
                curveTo(22.98f, 19.72f, 22.61f, 21.06f, 21.62f, 21.92f)
                curveTo(21.02f, 22.49f, 20.2f, 22.81f, 19.34f, 22.81f)
                close()
                moveTo(13.79f, 19.07f)
                curveTo(13.03f, 19.14f, 12.75f, 19.71f, 12.75f, 20.19f)
                curveTo(12.75f, 20.67f, 13.03f, 21.25f, 13.81f, 21.31f)
                horizontalLineTo(19.32f)
                curveTo(19.8f, 21.35f, 20.28f, 21.13f, 20.64f, 20.81f)
                curveTo(21.29f, 20.24f, 21.33f, 19.43f, 21.16f, 18.85f)
                curveTo(20.99f, 18.27f, 20.49f, 17.62f, 19.65f, 17.51f)
                curveTo(19.32f, 17.47f, 19.06f, 17.22f, 19f, 16.89f)
                curveTo(18.78f, 15.54f, 18.02f, 15.04f, 17.43f, 14.85f)
                curveTo(16.55f, 14.58f, 15.51f, 14.86f, 14.88f, 15.52f)
                curveTo(14.45f, 15.97f, 14.03f, 16.78f, 14.5f, 18.07f)
                curveTo(14.64f, 18.46f, 14.44f, 18.89f, 14.05f, 19.03f)
                curveTo(13.96f, 19.06f, 13.87f, 19.07f, 13.79f, 19.07f)
                close()
            }
        }.build()

        return _FolderCloud!!
    }

@Suppress("ObjectPropertyName")
private var _FolderCloud: ImageVector? = null
