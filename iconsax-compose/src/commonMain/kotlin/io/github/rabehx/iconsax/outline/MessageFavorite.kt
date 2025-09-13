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

val Iconsax.Outline.MessageFavorite: ImageVector
    get() {
        if (_MessageFavorite != null) {
            return _MessageFavorite!!
        }
        _MessageFavorite = ImageVector.Builder(
            name = "Outline.MessageFavorite",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 22.81f)
                curveTo(11.31f, 22.81f, 10.66f, 22.46f, 10.2f, 21.85f)
                lineTo(8.7f, 19.85f)
                curveTo(8.67f, 19.81f, 8.55f, 19.75f, 8.49f, 19.75f)
                horizontalLineTo(8f)
                curveTo(3.83f, 19.75f, 1.25f, 18.62f, 1.25f, 13f)
                verticalLineTo(8f)
                curveTo(1.25f, 3.58f, 3.58f, 1.25f, 8f, 1.25f)
                horizontalLineTo(12f)
                curveTo(12.41f, 1.25f, 12.75f, 1.59f, 12.75f, 2f)
                curveTo(12.75f, 2.41f, 12.41f, 2.75f, 12f, 2.75f)
                horizontalLineTo(8f)
                curveTo(4.42f, 2.75f, 2.75f, 4.42f, 2.75f, 8f)
                verticalLineTo(13f)
                curveTo(2.75f, 17.52f, 4.3f, 18.25f, 8f, 18.25f)
                horizontalLineTo(8.5f)
                curveTo(9.01f, 18.25f, 9.59f, 18.54f, 9.9f, 18.95f)
                lineTo(11.4f, 20.95f)
                curveTo(11.75f, 21.41f, 12.25f, 21.41f, 12.6f, 20.95f)
                lineTo(14.1f, 18.95f)
                curveTo(14.43f, 18.51f, 14.95f, 18.25f, 15.5f, 18.25f)
                horizontalLineTo(16f)
                curveTo(19.58f, 18.25f, 21.25f, 16.58f, 21.25f, 13f)
                verticalLineTo(8f)
                curveTo(21.25f, 7.59f, 21.59f, 7.25f, 22f, 7.25f)
                curveTo(22.41f, 7.25f, 22.75f, 7.59f, 22.75f, 8f)
                verticalLineTo(13f)
                curveTo(22.75f, 17.42f, 20.42f, 19.75f, 16f, 19.75f)
                horizontalLineTo(15.5f)
                curveTo(15.42f, 19.75f, 15.35f, 19.79f, 15.3f, 19.85f)
                lineTo(13.8f, 21.85f)
                curveTo(13.34f, 22.46f, 12.69f, 22.81f, 12f, 22.81f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 12f)
                curveTo(11.44f, 12f, 11f, 11.55f, 11f, 11f)
                curveTo(11f, 10.45f, 11.45f, 10f, 12f, 10f)
                curveTo(12.55f, 10f, 13f, 10.45f, 13f, 11f)
                curveTo(13f, 11.55f, 12.56f, 12f, 12f, 12f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16f, 12f)
                curveTo(15.44f, 12f, 15f, 11.55f, 15f, 11f)
                curveTo(15f, 10.45f, 15.45f, 10f, 16f, 10f)
                curveTo(16.55f, 10f, 17f, 10.45f, 17f, 11f)
                curveTo(17f, 11.55f, 16.56f, 12f, 16f, 12f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8f, 12f)
                curveTo(7.44f, 12f, 7f, 11.55f, 7f, 11f)
                curveTo(7f, 10.45f, 7.45f, 10f, 8f, 10f)
                curveTo(8.55f, 10f, 9f, 10.45f, 9f, 11f)
                curveTo(9f, 11.55f, 8.56f, 12f, 8f, 12f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18f, 7.75f)
                curveTo(17.14f, 7.75f, 15.11f, 6.73f, 14.49f, 4.86f)
                curveTo(14.24f, 4.12f, 14.3f, 3.27f, 14.65f, 2.6f)
                curveTo(14.96f, 2f, 15.48f, 1.56f, 16.12f, 1.36f)
                curveTo(16.77f, 1.16f, 17.46f, 1.25f, 18f, 1.58f)
                curveTo(18.54f, 1.25f, 19.23f, 1.16f, 19.89f, 1.36f)
                curveTo(20.53f, 1.56f, 21.05f, 2f, 21.36f, 2.6f)
                curveTo(21.71f, 3.27f, 21.77f, 4.12f, 21.52f, 4.86f)
                curveTo(20.89f, 6.76f, 18.77f, 7.75f, 18f, 7.75f)
                close()
                moveTo(15.91f, 4.38f)
                curveTo(16.33f, 5.64f, 17.76f, 6.22f, 18.02f, 6.25f)
                curveTo(18.31f, 6.22f, 19.71f, 5.57f, 20.1f, 4.39f)
                curveTo(20.22f, 4.03f, 20.19f, 3.6f, 20.03f, 3.29f)
                curveTo(19.9f, 3.04f, 19.71f, 2.88f, 19.45f, 2.8f)
                curveTo(19.17f, 2.7f, 18.79f, 2.75f, 18.62f, 3f)
                curveTo(18.48f, 3.2f, 18.26f, 3.32f, 18.02f, 3.33f)
                curveTo(17.78f, 3.33f, 17.55f, 3.22f, 17.4f, 3.03f)
                curveTo(17.19f, 2.76f, 16.82f, 2.72f, 16.55f, 2.8f)
                curveTo(16.29f, 2.88f, 16.1f, 3.04f, 15.97f, 3.29f)
                curveTo(15.82f, 3.6f, 15.79f, 4.02f, 15.91f, 4.38f)
                close()
            }
        }.build()

        return _MessageFavorite!!
    }

@Suppress("ObjectPropertyName")
private var _MessageFavorite: ImageVector? = null
